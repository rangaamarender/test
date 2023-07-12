/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.core.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

/**
 * @author sgutti
 * @date Nov 6, 2018 11:59:17 PM
 */
@Component(value = EmailHelper.NAME)
public class EmailHelper {
    // --------------------------------------------------------------- Constants
    public static final String NAME = "emailHelper";
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    @Autowired
    private JavaMailSender mailSender;
    // ------------------------------------------------------------ Constructors
    /**
     * Create a new <code>EmailHelper</code>
     */
    private EmailHelper() {
        super();
    }

    // ---------------------------------------------------------- Public Methods
    /**
     * @param emailContent
     * @throws MessagingException
     */
    public void sendEmail(EmailContent emailContent) throws MessagingException {
        final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
        final MimeMessageHelper msg = new MimeMessageHelper(mimeMessage,
                "UTF-8");
        msg.setTo(emailContent.getTo());
        msg.setFrom(emailContent.getFrom());
        msg.setSubject(emailContent.getSubject());
        msg.setText(emailContent.getBody(), true);
        if (emailContent.getCc() != null && emailContent.getCc().length > 0) {
            msg.setCc(emailContent.getCc());
        }
        mailSender.send(mimeMessage);
    }
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
}
