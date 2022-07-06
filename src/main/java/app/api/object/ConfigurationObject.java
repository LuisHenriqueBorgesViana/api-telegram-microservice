package app.api.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ConfigurationObject {
	
	@JsonProperty("urlToken")
	@ApiModelProperty(notes = "Token Telegram", name = "Token Telegram", required = true, value = "Telegram Identification and Access Token.", example= "5500009396:AAGdYYgduxENIAK1fTowhr64wFOdsC8VNtw", position = 1)	
	private String urlToken;
	
	@JsonProperty("licenseApi")
	@ApiModelProperty(notes = "API License", name = "API License", required = true, value = "API Usage License.", example= "55AAGdYYgduxENIAK23481fTowhr64wFOdsC238VNtw", position = 2)		
	private String licenseApi;
}
