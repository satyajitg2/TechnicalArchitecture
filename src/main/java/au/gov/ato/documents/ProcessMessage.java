package au.gov.ato.documents;

import com.fasterxml.jackson.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
    "id",
    "severity",
    "message",
    "messageFieldName",
    "fdfSectionId",
    "fdfFieldSequence",
    "ruleId",
    "context"
})
public class ProcessMessage {

    @JsonProperty("id")
    private String id;
    @JsonProperty("severity")
    private ProcessMessage.Severity severity;
    @JsonProperty("message")
    private String message;
    @JsonProperty("messageFieldName")
    private String messageFieldName;
    @JsonProperty("fdfSectionId")
    private String fdfSectionId;
    @JsonProperty("fdfFieldSequence")
    private String fdfFieldSequence;
    @JsonProperty("ruleId")
    private Integer ruleId;
    @JsonProperty("context")

    private List<String> context = new ArrayList<String>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("severity")
    public ProcessMessage.Severity getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("messageFieldName")
    public String getMessageFieldName() {
        return messageFieldName;
    }

    @JsonProperty("messageFieldName")
    public void setMessageFieldName(String messageFieldName) {
        this.messageFieldName = messageFieldName;
    }

    @JsonProperty("fdfSectionId")
    public String getFdfSectionId() {
        return fdfSectionId;
    }

    @JsonProperty("fdfSectionId")
    public void setFdfSectionId(String fdfSectionId) {
        this.fdfSectionId = fdfSectionId;
    }

    @JsonProperty("fdfFieldSequence")
    public String getFdfFieldSequence() {
        return fdfFieldSequence;
    }

    @JsonProperty("fdfFieldSequence")
    public void setFdfFieldSequence(String fdfFieldSequence) {
        this.fdfFieldSequence = fdfFieldSequence;
    }

    @JsonProperty("ruleId")
    public Integer getRuleId() {
        return ruleId;
    }

    @JsonProperty("ruleId")
    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    @JsonProperty("context")
    public List<String> getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(List<String> context) {
        this.context = context;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProcessMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("messageFieldName");
        sb.append('=');
        sb.append(((this.messageFieldName == null)?"<null>":this.messageFieldName));
        sb.append(',');
        sb.append("fdfSectionId");
        sb.append('=');
        sb.append(((this.fdfSectionId == null)?"<null>":this.fdfSectionId));
        sb.append(',');
        sb.append("fdfFieldSequence");
        sb.append('=');
        sb.append(((this.fdfFieldSequence == null)?"<null>":this.fdfFieldSequence));
        sb.append(',');
        sb.append("ruleId");
        sb.append('=');
        sb.append(((this.ruleId == null)?"<null>":this.ruleId));
        sb.append(',');
        sb.append("context");
        sb.append('=');
        sb.append(((this.context == null)?"<null>":this.context));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.messageFieldName == null)? 0 :this.messageFieldName.hashCode()));
        result = ((result* 31)+((this.fdfSectionId == null)? 0 :this.fdfSectionId.hashCode()));
        result = ((result* 31)+((this.context == null)? 0 :this.context.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.fdfFieldSequence == null)? 0 :this.fdfFieldSequence.hashCode()));
        result = ((result* 31)+((this.ruleId == null)? 0 :this.ruleId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcessMessage) == false) {
            return false;
        }
        ProcessMessage rhs = ((ProcessMessage) other);
        return ((((((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.messageFieldName == rhs.messageFieldName)||((this.messageFieldName!= null)&&this.messageFieldName.equals(rhs.messageFieldName))))&&((this.fdfSectionId == rhs.fdfSectionId)||((this.fdfSectionId!= null)&&this.fdfSectionId.equals(rhs.fdfSectionId))))&&((this.context == rhs.context)||((this.context!= null)&&this.context.equals(rhs.context))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.fdfFieldSequence == rhs.fdfFieldSequence)||((this.fdfFieldSequence!= null)&&this.fdfFieldSequence.equals(rhs.fdfFieldSequence))))&&((this.ruleId == rhs.ruleId)||((this.ruleId!= null)&&this.ruleId.equals(rhs.ruleId)));
    }

    public enum Severity {

        E("E"),
        W("W"),
        I("I"),
        S("S");
        private final String value;
        private final static Map<String, Severity> CONSTANTS = new HashMap<String, Severity>();

        static {
            for (Severity c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static ProcessMessage.Severity fromValue(String value) {
            Severity constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
