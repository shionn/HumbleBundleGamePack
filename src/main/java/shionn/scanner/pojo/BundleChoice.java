package shionn.scanner.pojo;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BundleChoice {
	private BigDecimal price;
	private List<String> games;
}
