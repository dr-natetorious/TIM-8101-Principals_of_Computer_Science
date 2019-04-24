public class ryey.easer.core.ui.data.profile.a<T extends ryey.easer.commons.local_plugin.c.b> extends ryey.easer.core.ui.data.h<T> {
  public ryey.easer.core.ui.data.profile.a();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/core/ui/data/h."<init>":()V
       4: return

  static ryey.easer.commons.local_plugin.e a(ryey.easer.core.ui.data.profile.a);
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:Lryey/easer/commons/local_plugin/e;
       4: areturn

  static <T extends ryey.easer.commons.local_plugin.c.b> ryey.easer.core.ui.data.profile.a<T> a(ryey.easer.commons.local_plugin.c.d<T>);
    Code:
       0: new           #23                 // class android/os/Bundle
       3: dup
       4: invokespecial #24                 // Method android/os/Bundle."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #26                 // String plugin
      11: aload_0
      12: invokeinterface #31,  1           // InterfaceMethod ryey/easer/commons/local_plugin/c/d.a:()Ljava/lang/String;
      17: invokevirtual #35                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      20: new           #2                  // class ryey/easer/core/ui/data/profile/a
      23: dup
      24: invokespecial #36                 // Method "<init>":()V
      27: astore_0
      28: aload_0
      29: aload_1
      30: invokevirtual #40                 // Method setArguments:(Landroid/os/Bundle;)V
      33: aload_0
      34: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #46                 // Method b:()Lryey/easer/commons/local_plugin/c/b;
       4: areturn

  protected void a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #49                 // class ryey/easer/commons/local_plugin/c/b
       5: invokevirtual #52                 // Method a:(Lryey/easer/commons/local_plugin/c/b;)V
       8: return

  protected void a(T);
    Code:
       0: aload_0
       1: getfield      #54                 // Field c:Landroid/widget/CheckBox;
       4: iconst_1
       5: invokevirtual #60                 // Method android/widget/CheckBox.setChecked:(Z)V
       8: aload_0
       9: aload_1
      10: invokespecial #63                 // Method ryey/easer/core/ui/data/h.a:(Lryey/easer/commons/local_plugin/f;)V
      13: return

  protected void a(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #49                 // class ryey/easer/commons/local_plugin/c/b
       5: invokevirtual #52                 // Method a:(Lryey/easer/commons/local_plugin/c/b;)V
       8: return

  public T b();
    Code:
       0: aload_0
       1: getfield      #54                 // Field c:Landroid/widget/CheckBox;
       4: invokevirtual #68                 // Method android/widget/CheckBox.isChecked:()Z
       7: ifeq          18
      10: aload_0
      11: invokespecial #70                 // Method ryey/easer/core/ui/data/h.a:()Lryey/easer/commons/local_plugin/f;
      14: checkcast     #49                 // class ryey/easer/commons/local_plugin/c/b
      17: areturn
      18: new           #72                 // class java/lang/IllegalStateException
      21: dup
      22: ldc           #74                 // String The view should be checked as \"enabled\" before getting its data
      24: invokespecial #77                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      27: athrow

  boolean c();
    Code:
       0: aload_0
       1: getfield      #54                 // Field c:Landroid/widget/CheckBox;
       4: invokevirtual #68                 // Method android/widget/CheckBox.isChecked:()Z
       7: ireturn

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #81                 // Method ryey/easer/core/ui/data/h.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: invokevirtual #85                 // Method getArguments:()Landroid/os/Bundle;
       9: ldc           #26                 // String plugin
      11: invokevirtual #89                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      14: astore_1
      15: aload_0
      16: invokestatic  #94                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      19: invokevirtual #97                 // Method ryey/easer/plugins/b.c:()Lryey/easer/plugins/b$c;
      22: aload_1
      23: invokevirtual #102                // Method ryey/easer/plugins/b$c.b:(Ljava/lang/String;)Lryey/easer/commons/local_plugin/d;
      26: checkcast     #28                 // class ryey/easer/commons/local_plugin/c/d
      29: invokeinterface #106,  1          // InterfaceMethod ryey/easer/commons/local_plugin/c/d.d:()Lryey/easer/commons/local_plugin/e;
      34: putfield      #20                 // Field b:Lryey/easer/commons/local_plugin/e;
      37: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #109                // int 2131427395
       3: aload_2
       4: iconst_0
       5: invokevirtual #115                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: invokevirtual #119                // Method getChildFragmentManager:()Landroid/support/v4/app/n;
      13: invokevirtual #124                // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      16: ldc           #125                // int 2131296354
      18: aload_0
      19: getfield      #20                 // Field b:Lryey/easer/commons/local_plugin/e;
      22: invokevirtual #130                // Method android/support/v4/app/u.b:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
      25: invokevirtual #133                // Method android/support/v4/app/u.c:()I
      28: pop
      29: aload_0
      30: invokevirtual #119                // Method getChildFragmentManager:()Landroid/support/v4/app/n;
      33: invokevirtual #135                // Method android/support/v4/app/n.b:()Z
      36: pop
      37: aload_0
      38: aload_1
      39: ldc           #136                // int 2131296341
      41: invokevirtual #142                // Method android/view/View.findViewById:(I)Landroid/view/View;
      44: checkcast     #56                 // class android/widget/CheckBox
      47: putfield      #54                 // Field c:Landroid/widget/CheckBox;
      50: aload_0
      51: getfield      #20                 // Field b:Lryey/easer/commons/local_plugin/e;
      54: iconst_0
      55: invokevirtual #146                // Method ryey/easer/commons/local_plugin/e.a:(Z)V
      58: aload_0
      59: getfield      #54                 // Field c:Landroid/widget/CheckBox;
      62: new           #7                  // class ryey/easer/core/ui/data/profile/a$1
      65: dup
      66: aload_0
      67: invokespecial #149                // Method ryey/easer/core/ui/data/profile/a$1."<init>":(Lryey/easer/core/ui/data/profile/a;)V
      70: invokevirtual #153                // Method android/widget/CheckBox.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
      73: aload_0
      74: getfield      #20                 // Field b:Lryey/easer/commons/local_plugin/e;
      77: aload_0
      78: invokevirtual #157                // Method getResources:()Landroid/content/res/Resources;
      81: invokevirtual #160                // Method ryey/easer/commons/local_plugin/e.a:(Landroid/content/res/Resources;)Ljava/lang/String;
      84: astore_2
      85: aload_1
      86: ldc           #161                // int 2131296715
      88: invokevirtual #142                // Method android/view/View.findViewById:(I)Landroid/view/View;
      91: checkcast     #163                // class android/widget/TextView
      94: aload_2
      95: invokevirtual #167                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      98: aload_1
      99: areturn
}
