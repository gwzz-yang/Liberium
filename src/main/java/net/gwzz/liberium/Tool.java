package net.gwzz.liberium;

public final class Tool {

  @FunctionalInterface
  public static interface Procedure{
    public void execute();
  }

  @FunctionalInterface
  public static interface ProcedureThrowsException {
    public void execute() throws Exception;
  }

  public static void tryCatch(ProcedureThrowsException p){
    try{
      p.execute();
    } catch(Exception e){
      e.printStackTrace();
    }
  }

}