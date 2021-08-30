package au.gov.ato.documents;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "code",
    "uniqueIdentifier",
    "description",
    "additionalDetails"
})
public class Error {

    @JsonProperty("code")
    private String code;

    @JsonProperty("uniqueIdentifier")
    private String uniqueIdentifier;

    @JsonProperty("description")
    private String description;

    @JsonProperty("additionalDetails")
    private List<AdditionalDetail> additionalDetails = new ArrayList<AdditionalDetail>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("uniqueIdentifier")
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    @JsonProperty("uniqueIdentifier")
    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("additionalDetails")
    public List<AdditionalDetail> getAdditionalDetails() {
        return additionalDetails;
    }

    @JsonProperty("additionalDetails")
    public void setAdditionalDetails(List<AdditionalDetail> additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Error.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("uniqueIdentifier");
        sb.append('=');
        sb.append(((this.uniqueIdentifier == null)?"<null>":this.uniqueIdentifier));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("additionalDetails");
        sb.append('=');
        sb.append(((this.additionalDetails == null)?"<null>":this.additionalDetails));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalDetails == null)? 0 :this.additionalDetails.hashCode()));
        result = ((result* 31)+((this.uniqueIdentifier == null)? 0 :this.uniqueIdentifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return ((((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.additionalDetails == rhs.additionalDetails)||((this.additionalDetails!= null)&&this.additionalDetails.equals(rhs.additionalDetails))))&&((this.uniqueIdentifier == rhs.uniqueIdentifier)||((this.uniqueIdentifier!= null)&&this.uniqueIdentifier.equals(rhs.uniqueIdentifier)))));
    }
}
