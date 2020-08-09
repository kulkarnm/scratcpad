package model.plan;


import model.interest.InterestRateDefinition;
import model.product.Product;
import model.transaction.TCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//equivalent to Plans in Vision+
@Document
public class Plan{
    @Id
    private String planId;
    private GlobalPlan overriddenPlan;
    //plan associated with a product, may override settings in GlobalPlan
    private Product product;
    private PlanClass planClass;
    private InterestRateDefinition interestRateDefinition;
    private InterestCalculationStrategy interestCalculationStrategy;

    private List<TCode> mappedTCodes;
}
