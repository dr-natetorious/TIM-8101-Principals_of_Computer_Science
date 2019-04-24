public class android.support.design.internal.NavigationMenuView extends android.support.v7.widget.RecyclerView implements android.support.v7.view.menu.p {
  public android.support.design.internal.NavigationMenuView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #11                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.internal.NavigationMenuView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #15                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.design.internal.NavigationMenuView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #16                 // Method android/support/v7/widget/RecyclerView."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #18                 // class android/support/v7/widget/LinearLayoutManager
      11: dup
      12: aload_1
      13: iconst_1
      14: iconst_0
      15: invokespecial #21                 // Method android/support/v7/widget/LinearLayoutManager."<init>":(Landroid/content/Context;IZ)V
      18: invokevirtual #25                 // Method setLayoutManager:(Landroid/support/v7/widget/RecyclerView$i;)V
      21: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: return

  public int getWindowAnimations();
    Code:
       0: iconst_0
       1: ireturn
}
