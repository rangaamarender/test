/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.imgscalr.Scalr;

/**
 * @author sgutti
 * @date Aug 1, 2014 3:00:00 AM
 */
public class ImageCompressionUtil {
    // --------------------------------------------------------------- Constants
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>ImageCompressionUtil</code>
     */
    private ImageCompressionUtil() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    /**
     * @param img
     * @param targetWidth
     * @param targetHeight
     * @param hint
     * @param higherQuality
     * @return
     */
    private static BufferedImage getScaledInstance(final BufferedImage img,
                                                   final int targetWidth,
                                                   final int targetHeight,
                                                   final Object hint,
                                                   final boolean higherQuality) {
        int type = (img.getTransparency() == Transparency.OPAQUE)
                ? BufferedImage.TYPE_INT_RGB
                : BufferedImage.TYPE_INT_ARGB;
        BufferedImage ret = img;
        int w, h;
        if (higherQuality) {
            // Use multi-step technique: start with original size, then
            // scale down in multiple passes with drawImage()
            // until the target size is reached
            w = img.getWidth();
            h = img.getHeight();
        } else {
            // Use one-step technique: scale directly from original
            // size to target size with a single drawImage() call
            w = targetWidth;
            h = targetHeight;
        }
        do {
            if (higherQuality && w > targetWidth) {
                w /= 2;
                if (w < targetWidth) {
                    w = targetWidth;
                }
            }
            if (higherQuality && h > targetHeight) {
                h /= 2;
                if (h < targetHeight) {
                    h = targetHeight;
                }
            }
            BufferedImage tmp = new BufferedImage(w, h, type);
            Graphics2D g2 = tmp.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, hint);
            g2.drawImage(ret, 0, 0, w, h, null);
            g2.dispose();
            ret = tmp;
        } while (w != targetWidth || h != targetHeight);
        return ret;
    }

    /**
     * @param image
     * @return
     */
    public static BufferedImage compressImage250By75(final BufferedImage image) {
        return getScaledInstance(image, 250, 75,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR, true);
    }

    /**
     * @param image
     * @param targetWidth
     * @param targetHeight
     * @return
     */
    public static BufferedImage compressImage(final BufferedImage image,
                                              final int targetWidth,
                                              final int targetHeight) {
        return Scalr.resize(image, targetWidth, targetHeight,
                Scalr.OP_ANTIALIAS);
    }

    /**
     * @param imageInput
     * @param targetWidth
     * @param targetHeight
     * @return
     * @throws IOException
     */
    public static byte[] compressImage(final byte[] imageInput,
                                       final int targetWidth,
                                       final int targetHeight)
            throws IOException {
        InputStream in = new ByteArrayInputStream(imageInput);
        BufferedImage buffImage = ImageIO.read(in);
        BufferedImage compressedImg = Scalr.resize(buffImage, targetWidth,
                targetHeight, Scalr.OP_ANTIALIAS);
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1000);
        ImageIO.write(compressedImg, "png", baos);
        //
        return baos.toByteArray();
    }

    /**
     * @param byteArray
     * @return
     * @throws IOException
     */
    public static BufferedImage compressImage250By75(final byte[] byteArray)
            throws IOException {
        InputStream in = new ByteArrayInputStream(byteArray);
        BufferedImage image = ImageIO.read(in);
        return getScaledInstance(image, 250, 75,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR, true);
    }

    /**
     * @param buffImage
     * @return
     * @throws IOException
     */
    public static byte[] bufferedImgToByteArray(final BufferedImage buffImage)
            throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1000);
        ImageIO.write(buffImage, "PNG", baos);
        byte[] resultImageAsRawBytes = baos.toByteArray();
        baos.flush();
        return resultImageAsRawBytes;
    }
    // ----------------------------------------------------------- Inner Classes
}
