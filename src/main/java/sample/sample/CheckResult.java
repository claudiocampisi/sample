package sample.sample;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CheckResult implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private final String EXAMPLE = "example";
   private boolean outcome;

   public CheckResult()
   {
   }

   public boolean isOutcome()
   {
      return this.outcome;
   }

   public void setOutcome(boolean outcome)
   {
      this.outcome = outcome;
   }

   public CheckResult(boolean outcome)
   {
      this.outcome = outcome;
   }

}