package au.gov.ato.documents;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonPropertyOrder({
        "messages",
        "error"
})
public class StandardExceptionResponse {
    @JsonProperty("messages")
    private List<ProcessMessage> messages = new ArrayList<ProcessMessage>();
    @JsonProperty("error")
    private Error error;

    @JsonProperty("messages")
    public List<ProcessMessage> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<ProcessMessage> messages) {
        this.messages = messages;
    }

    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }
}
