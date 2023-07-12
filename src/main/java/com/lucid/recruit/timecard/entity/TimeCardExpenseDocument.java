package com.lucid.recruit.timecard.entity;

import com.lucid.recruit.docs.entity.BaseDocument;
import jakarta.persistence.*;

@Entity
@Table(name = TimeCardExpenseDocument.TABLE_NAME)
public class TimeCardExpenseDocument extends BaseDocument {
    // --------------------------------------------------------------- Constants
    private static final long serialVersionUID = 8419402802337278054L;
    public static final String TABLE_NAME = "t_timecardexpense_doc";

    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "timecard_expence_doc_id", nullable = false, length = 75)
    private String timeCardExpenseDocID;

    @JoinColumn(name = "timecard_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private TimeCard timeCard;


    public String getTimeCardExpenseDocID() {
        return timeCardExpenseDocID;
    }

    public void setTimeCardExpenseDocID(String timeCardExpenseDocID) {
        this.timeCardExpenseDocID = timeCardExpenseDocID;
    }

    public TimeCard getTimeCard() {
        return timeCard;
    }

    public void setTimeCard(TimeCard timeCard) {
        this.timeCard = timeCard;
    }


    // ------------------------------------------------------------ Constructors

    public TimeCardExpenseDocument() {super();}



}
