public class ryey.easer.core.ui.AboutActivity extends android.app.Activity {
  public ryey.easer.core.ui.AboutActivity();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method android/app/Activity."<init>":()V
       4: return

  public void a();
    Code:
       0: aload_0
       1: ldc           #36                 // String https://github.com/renyuneyun/Easer
       3: invokespecial #38                 // Method a:(Ljava/lang/String;)V
       6: return

  public void b();
    Code:
       0: aload_0
       1: ldc           #41                 // String http://renyuneyun.is-programmer.com/
       3: invokespecial #38                 // Method a:(Ljava/lang/String;)V
       6: return

  public void c();
    Code:
       0: aload_0
       1: invokevirtual #45                 // Method finish:()V
       4: return

  public void howL(android.view.View);
    Code:
       0: aload_0
       1: ldc           #49                 // String https://www.gnu.org/licenses/gpl.txt
       3: invokespecial #38                 // Method a:(Ljava/lang/String;)V
       6: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #53                 // Method android/app/Activity.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: ldc           #54                 // int 2131427355
       8: invokevirtual #58                 // Method setContentView:(I)V
      11: aload_0
      12: ldc           #59                 // int 2131296413
      14: invokevirtual #63                 // Method findViewById:(I)Landroid/view/View;
      17: checkcast     #65                 // class android/support/design/widget/FloatingActionButton
      20: new           #6                  // class ryey/easer/core/ui/AboutActivity$1
      23: dup
      24: aload_0
      25: invokespecial #68                 // Method ryey/easer/core/ui/AboutActivity$1."<init>":(Lryey/easer/core/ui/AboutActivity;)V
      28: invokevirtual #72                 // Method android/support/design/widget/FloatingActionButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      31: aload_0
      32: ldc           #73                 // int 2131296415
      34: invokevirtual #63                 // Method findViewById:(I)Landroid/view/View;
      37: checkcast     #65                 // class android/support/design/widget/FloatingActionButton
      40: new           #8                  // class ryey/easer/core/ui/AboutActivity$2
      43: dup
      44: aload_0
      45: invokespecial #74                 // Method ryey/easer/core/ui/AboutActivity$2."<init>":(Lryey/easer/core/ui/AboutActivity;)V
      48: invokevirtual #72                 // Method android/support/design/widget/FloatingActionButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      51: aload_0
      52: ldc           #75                 // int 2131296414
      54: invokevirtual #63                 // Method findViewById:(I)Landroid/view/View;
      57: checkcast     #65                 // class android/support/design/widget/FloatingActionButton
      60: new           #10                 // class ryey/easer/core/ui/AboutActivity$3
      63: dup
      64: aload_0
      65: invokespecial #76                 // Method ryey/easer/core/ui/AboutActivity$3."<init>":(Lryey/easer/core/ui/AboutActivity;)V
      68: invokevirtual #72                 // Method android/support/design/widget/FloatingActionButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      71: return
}
