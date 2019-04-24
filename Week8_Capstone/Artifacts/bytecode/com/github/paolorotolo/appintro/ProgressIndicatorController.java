public class com.github.paolorotolo.appintro.ProgressIndicatorController implements com.github.paolorotolo.appintro.IndicatorController {
  public static final int DEFAULT_COLOR;

  int selectedDotColor;

  int unselectedDotColor;

  public com.github.paolorotolo.appintro.ProgressIndicatorController();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #21                 // Field selectedDotColor:I
       9: aload_0
      10: iconst_1
      11: putfield      #23                 // Field unselectedDotColor:I
      14: return

  public void initialize(int);
    Code:
       0: aload_0
       1: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
       4: iload_1
       5: invokevirtual #33                 // Method android/widget/ProgressBar.setMax:(I)V
       8: aload_0
       9: iconst_0
      10: invokevirtual #36                 // Method selectPosition:(I)V
      13: return

  public android.view.View newInstance(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: getstatic     #43                 // Field com/github/paolorotolo/appintro/R$layout.progress_indicator:I
       5: aconst_null
       6: invokestatic  #49                 // Method android/view/View.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
       9: checkcast     #30                 // class android/widget/ProgressBar
      12: putfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
      15: aload_0
      16: getfield      #21                 // Field selectedDotColor:I
      19: iconst_1
      20: if_icmpeq     40
      23: aload_0
      24: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
      27: invokevirtual #53                 // Method android/widget/ProgressBar.getProgressDrawable:()Landroid/graphics/drawable/Drawable;
      30: aload_0
      31: getfield      #21                 // Field selectedDotColor:I
      34: getstatic     #59                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      37: invokevirtual #65                 // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      40: aload_0
      41: getfield      #23                 // Field unselectedDotColor:I
      44: iconst_1
      45: if_icmpeq     65
      48: aload_0
      49: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
      52: invokevirtual #68                 // Method android/widget/ProgressBar.getIndeterminateDrawable:()Landroid/graphics/drawable/Drawable;
      55: aload_0
      56: getfield      #23                 // Field unselectedDotColor:I
      59: getstatic     #59                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      62: invokevirtual #65                 // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      65: aload_0
      66: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
      69: areturn

  public void selectPosition(int);
    Code:
       0: aload_0
       1: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
       4: iload_1
       5: iconst_1
       6: iadd
       7: invokevirtual #71                 // Method android/widget/ProgressBar.setProgress:(I)V
      10: return

  public void setSelectedIndicatorColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #21                 // Field selectedDotColor:I
       5: aload_0
       6: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
       9: ifnull        26
      12: aload_0
      13: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
      16: invokevirtual #53                 // Method android/widget/ProgressBar.getProgressDrawable:()Landroid/graphics/drawable/Drawable;
      19: iload_1
      20: getstatic     #59                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      23: invokevirtual #65                 // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      26: return

  public void setUnselectedIndicatorColor(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #23                 // Field unselectedDotColor:I
       5: aload_0
       6: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
       9: ifnull        26
      12: aload_0
      13: getfield      #28                 // Field mProgressBar:Landroid/widget/ProgressBar;
      16: invokevirtual #68                 // Method android/widget/ProgressBar.getIndeterminateDrawable:()Landroid/graphics/drawable/Drawable;
      19: iload_1
      20: getstatic     #59                 // Field android/graphics/PorterDuff$Mode.SRC_IN:Landroid/graphics/PorterDuff$Mode;
      23: invokevirtual #65                 // Method android/graphics/drawable/Drawable.setColorFilter:(ILandroid/graphics/PorterDuff$Mode;)V
      26: return
}
