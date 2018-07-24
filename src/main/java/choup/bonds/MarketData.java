package choup.bonds;


import lombok.Builder;

import java.util.Date;

@Builder
public class MarketData {

    private Date ratingDate;

    private String ratingClass;


}
