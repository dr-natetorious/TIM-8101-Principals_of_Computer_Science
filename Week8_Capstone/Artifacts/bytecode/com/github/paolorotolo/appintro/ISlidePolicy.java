public interface com.github.paolorotolo.appintro.ISlidePolicy {
  public abstract boolean isPolicyRespected();

  public abstract void onUserIllegallyRequestedNextPage();
}
