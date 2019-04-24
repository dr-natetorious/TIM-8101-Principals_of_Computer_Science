public interface com.github.paolorotolo.appintro.IndicatorController {
  public abstract void initialize(int);

  public abstract android.view.View newInstance(android.content.Context);

  public abstract void selectPosition(int);

  public abstract void setSelectedIndicatorColor(int);

  public abstract void setUnselectedIndicatorColor(int);
}
