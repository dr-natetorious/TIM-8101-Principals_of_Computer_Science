public interface com.google.errorprone.annotations.RestrictedApi extends java.lang.annotation.Annotation {
  public abstract java.lang.String allowedOnPath();

  public abstract java.lang.String checkerName();

  public abstract java.lang.String explanation();

  public abstract java.lang.String link();

  public abstract java.lang.Class<? extends java.lang.annotation.Annotation>[] whitelistAnnotations();

  public abstract java.lang.Class<? extends java.lang.annotation.Annotation>[] whitelistWithWarningAnnotations();
}
