package com.example.cards.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Schema(
        name = "Response",
        description = "Schema to hold successful response information"
)
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    @Schema(
            description = "Status code in the response"
    )
    private String statusCode;

    @Schema(
            description = "Status message in the response"
    )
    private String statusMsg;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }
}
