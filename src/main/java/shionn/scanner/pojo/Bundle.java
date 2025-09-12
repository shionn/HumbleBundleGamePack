package shionn.scanner.pojo;

import java.util.Date;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bundle {
	private String url;
	private String name;
	private Date endDate;
	private List<BundleChoice> choices;
}
