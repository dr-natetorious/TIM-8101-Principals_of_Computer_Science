public class android.support.v7.widget.bb extends android.support.v4.view.b {
  final android.support.v7.widget.RecyclerView a;

  final android.support.v4.view.b c;

  public android.support.v7.widget.bb(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method android/support/v4/view/b."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       9: aload_0
      10: new           #6                  // class android/support/v7/widget/bb$a
      13: dup
      14: aload_0
      15: invokespecial #20                 // Method android/support/v7/widget/bb$a."<init>":(Landroid/support/v7/widget/bb;)V
      18: putfield      #22                 // Field c:Landroid/support/v4/view/b;
      21: return

  public void a(android.view.View, android.support.v4.view.a.b);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #26                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/support/v4/view/a/b;)V
       6: aload_2
       7: ldc           #28                 // class android/support/v7/widget/RecyclerView
       9: invokevirtual #34                 // Method java/lang/Class.getName:()Ljava/lang/String;
      12: invokevirtual #40                 // Method android/support/v4/view/a/b.b:(Ljava/lang/CharSequence;)V
      15: aload_0
      16: invokevirtual #43                 // Method b:()Z
      19: ifne          43
      22: aload_0
      23: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      26: invokevirtual #47                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      29: ifnull        43
      32: aload_0
      33: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      36: invokevirtual #47                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      39: aload_2
      40: invokevirtual #52                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/support/v4/view/a/b;)V
      43: return

  public void a(android.view.View, android.view.accessibility.AccessibilityEvent);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #55                 // Method android/support/v4/view/b.a:(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
       6: aload_2
       7: ldc           #28                 // class android/support/v7/widget/RecyclerView
       9: invokevirtual #34                 // Method java/lang/Class.getName:()Ljava/lang/String;
      12: invokevirtual #60                 // Method android/view/accessibility/AccessibilityEvent.setClassName:(Ljava/lang/CharSequence;)V
      15: aload_1
      16: instanceof    #28                 // class android/support/v7/widget/RecyclerView
      19: ifeq          49
      22: aload_0
      23: invokevirtual #43                 // Method b:()Z
      26: ifne          49
      29: aload_1
      30: checkcast     #28                 // class android/support/v7/widget/RecyclerView
      33: astore_1
      34: aload_1
      35: invokevirtual #47                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      38: ifnull        49
      41: aload_1
      42: invokevirtual #47                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      45: aload_2
      46: invokevirtual #63                 // Method android/support/v7/widget/RecyclerView$i.a:(Landroid/view/accessibility/AccessibilityEvent;)V
      49: return

  public boolean a(android.view.View, int, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokespecial #66                 // Method android/support/v4/view/b.a:(Landroid/view/View;ILandroid/os/Bundle;)Z
       7: ifeq          12
      10: iconst_1
      11: ireturn
      12: aload_0
      13: invokevirtual #43                 // Method b:()Z
      16: ifne          42
      19: aload_0
      20: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      23: invokevirtual #47                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      26: ifnull        42
      29: aload_0
      30: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      33: invokevirtual #47                 // Method android/support/v7/widget/RecyclerView.getLayoutManager:()Landroid/support/v7/widget/RecyclerView$i;
      36: iload_2
      37: aload_3
      38: invokevirtual #69                 // Method android/support/v7/widget/RecyclerView$i.a:(ILandroid/os/Bundle;)Z
      41: ireturn
      42: iconst_0
      43: ireturn

  boolean b();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: invokevirtual #72                 // Method android/support/v7/widget/RecyclerView.v:()Z
       7: ireturn

  public android.support.v4.view.b c();
    Code:
       0: aload_0
       1: getfield      #22                 // Field c:Landroid/support/v4/view/b;
       4: areturn
}
