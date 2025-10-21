package org.dependencytrack.model;

import javax.validation.constraints.Pattern;

public class RiskAssessmentDto {
    @Pattern(regexp = "^(LOW|MEDIUM|HIGH|CRITICAL)$", message = "Invalid impact value")
    private String impact;

    @Pattern(regexp = "^(VIRTUALLY_IMPOSSIBLE|UNLIKELY|POSSIBLE|LIKELY|ALMOST_CERTAIN)$", message = "Invalid likelihood value")
    private String likelihood;

    private String justification;

    public RiskAssessmentDto() {}

    public RiskAssessmentDto(String impact, String likelihood, String justification) {
        this.impact = impact;
        this.likelihood = likelihood;
        this.justification = justification;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }
}
