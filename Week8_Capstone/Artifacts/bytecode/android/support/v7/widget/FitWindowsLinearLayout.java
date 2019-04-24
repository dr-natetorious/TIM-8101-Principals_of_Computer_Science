public class android.support.v7.widget.FitWindowsLinearLayout extends android.widget.LinearLayout implements android.support.v7.widget.ar {
  public android.support.v7.widget.FitWindowsLinearLayout(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #12                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;)V
       5: return

  public android.support.v7.widget.FitWindowsLinearLayout(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #16                 // Method android/widget/LinearLayout."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  protected boolean fitSystemWindows(android.graphics.Rect);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/support/v7/widget/ar$a;
       4: ifnull        17
       7: aload_0
       8: getfield      #20                 // Field a:Landroid/support/v7/widget/ar$a;
      11: aload_1
      12: invokeinterface #25,  2           // InterfaceMethod android/support/v7/widget/ar$a.a:(Landroid/graphics/Rect;)V
      17: aload_0
      18: aload_1
      19: invokespecial #27                 // Method android/widget/LinearLayout.fitSystemWindows:(Landroid/graphics/Rect;)Z
      22: ireturn

  public void setOnFitSystemWindowsListener(android.support.v7.widget.ar$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field a:Landroid/support/v7/widget/ar$a;
       5: return
}
