
package io.srinath.testing.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Events {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("paymentNeeded")
    @Expose
    private String paymentNeeded;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("paymentAmount")
    @Expose
    private Integer paymentAmount;
    @SerializedName("paymentLastDate")
    @Expose
    private String paymentLastDate;
    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("subCategory")
    @Expose
    private Integer subCategory;
    @SerializedName("updated_by")
    @Expose
    private Object updatedBy;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The paymentNeeded
     */
    public String getPaymentNeeded() {
        return paymentNeeded;
    }

    /**
     *
     * @param paymentNeeded
     * The paymentNeeded
     */
    public void setPaymentNeeded(String paymentNeeded) {
        this.paymentNeeded = paymentNeeded;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The venue
     */
    public String getVenue() {
        return venue;
    }

    /**
     *
     * @param venue
     * The venue
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     *
     * @return
     * The startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     *
     * @param startTime
     * The startTime
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     *
     * @return
     * The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The paymentAmount
     */
    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    /**
     *
     * @param paymentAmount
     * The paymentAmount
     */
    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     *
     * @return
     * The paymentLastDate
     */
    public String getPaymentLastDate() {
        return paymentLastDate;
    }

    /**
     *
     * @param paymentLastDate
     * The paymentLastDate
     */
    public void setPaymentLastDate(String paymentLastDate) {
        this.paymentLastDate = paymentLastDate;
    }

    /**
     *
     * @return
     * The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     *
     * @param active
     * The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     *
     * @return
     * The subCategory
     */
    public Integer getSubCategory() {
        return subCategory;
    }

    /**
     *
     * @param subCategory
     * The subCategory
     */
    public void setSubCategory(Integer subCategory) {
        this.subCategory = subCategory;
    }

    /**
     *
     * @return
     * The updatedBy
     */
    public Object getUpdatedBy() {
        return updatedBy;
    }

    /**
     *
     * @param updatedBy
     * The updated_by
     */
    public void setUpdatedBy(Object updatedBy) {
        this.updatedBy = updatedBy;
    }

}