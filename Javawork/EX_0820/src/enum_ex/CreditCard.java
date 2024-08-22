package enum_ex;

import java.util.Arrays;
import java.util.List;

public enum CreditCard {
	SHINHAN("신한", Arrays.asList("Mr.Life 카드", "Deep Dream 카드", "Deep Oil 카드")),
	KB("국민", Arrays.asList("톡톡D카드","티타늄 카드", "다담 카드")),
	NH("농형", Arrays.asList("올바른 FLEX카드","테이크 5카드","NH올원 파이카드"));
	
	private String Enterprise;
	private List<String> Cards;
	
	CreditCard(String Enterprise, List<String> Cards){
		this.Enterprise = Enterprise;
		this.Cards = Cards;
	}
	
	// getter
	public String getEnterprise(){
		return Enterprise;
	}
	public List<String> getCards(){
		return Cards;
	}
}
