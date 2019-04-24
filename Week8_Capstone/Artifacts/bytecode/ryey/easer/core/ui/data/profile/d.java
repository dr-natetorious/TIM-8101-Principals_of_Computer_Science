public class ryey.easer.core.ui.data.profile.d extends ryey.easer.core.ui.data.c<ryey.easer.c.a> {
  static final boolean c;

  ryey.easer.core.f b;

  static {};
    Code:
       0: return

  public ryey.easer.core.ui.data.profile.d();
    Code:
       0: aload_0
       1: invokespecial #24                 // Method ryey/easer/core/ui/data/c."<init>":()V
       4: return

  static java.lang.Object a(ryey.easer.core.ui.data.profile.d);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Ljava/lang/Object;
       4: areturn

  public static ryey.easer.core.ui.data.profile.d a(java.lang.String, ryey.easer.c.a);
    Code:
       0: new           #2                  // class ryey/easer/core/ui/data/profile/d
       3: dup
       4: invokespecial #31                 // Method "<init>":()V
       7: astore_2
       8: new           #33                 // class android/os/Bundle
      11: dup
      12: invokespecial #34                 // Method android/os/Bundle."<init>":()V
      15: astore_3
      16: aload_3
      17: ldc           #36                 // String ryey.easer.core.ui.data.profile.RemoteOperationPluginViewContainerFragment.args.ID
      19: aload_0
      20: invokevirtual #40                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      23: aload_3
      24: ldc           #42                 // String ryey.easer.core.ui.data.profile.RemoteOperationPluginViewContainerFragment.args.TYPE
      26: aload_1
      27: invokevirtual #46                 // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      30: aload_2
      31: aload_3
      32: invokevirtual #50                 // Method setArguments:(Landroid/os/Bundle;)V
      35: aload_2
      36: areturn

  public ryey.easer.c.a a();
    Code:
       0: aload_0
       1: getfield      #53                 // Field d:Landroid/widget/CheckBox;
       4: invokevirtual #59                 // Method android/widget/CheckBox.isChecked:()Z
       7: ifeq          33
      10: aload_0
      11: getfield      #29                 // Field a:Ljava/lang/Object;
      14: ifnull        25
      17: aload_0
      18: getfield      #29                 // Field a:Ljava/lang/Object;
      21: checkcast     #61                 // class ryey/easer/c/a
      24: areturn
      25: new           #63                 // class ryey/easer/commons/local_plugin/c
      28: dup
      29: invokespecial #64                 // Method ryey/easer/commons/local_plugin/c."<init>":()V
      32: athrow
      33: new           #66                 // class java/lang/IllegalStateException
      36: dup
      37: ldc           #68                 // String The view should be checked as \"enabled\" before getting its data
      39: invokespecial #71                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      42: athrow

  protected void a(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #61                 // class ryey/easer/c/a
       5: invokevirtual #75                 // Method a:(Lryey/easer/c/a;)V
       8: return

  protected void a(ryey.easer.c.a);
    Code:
       0: aload_0
       1: getfield      #53                 // Field d:Landroid/widget/CheckBox;
       4: iconst_1
       5: invokevirtual #79                 // Method android/widget/CheckBox.setChecked:(Z)V
       8: aload_0
       9: aload_1
      10: putfield      #29                 // Field a:Ljava/lang/Object;
      13: return

  java.lang.String b();
    Code:
       0: aload_0
       1: invokevirtual #84                 // Method getArguments:()Landroid/os/Bundle;
       4: ldc           #36                 // String ryey.easer.core.ui.data.profile.RemoteOperationPluginViewContainerFragment.args.ID
       6: invokevirtual #88                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
       9: areturn

  boolean c();
    Code:
       0: aload_0
       1: getfield      #53                 // Field d:Landroid/widget/CheckBox;
       4: invokevirtual #59                 // Method android/widget/CheckBox.isChecked:()Z
       7: ireturn

  public void onActivityResult(int, int, android.content.Intent);
    Code:
       0: iload_1
       1: bipush        10
       3: if_icmpne     31
       6: iload_2
       7: iconst_m1
       8: if_icmpne     38
      11: aload_3
      12: ldc           #61                 // class ryey/easer/c/a
      14: invokevirtual #96                 // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      17: invokevirtual #102                // Method android/content/Intent.setExtrasClassLoader:(Ljava/lang/ClassLoader;)V
      20: aload_0
      21: aload_3
      22: ldc           #104                // String ryey.easer.remote_plugin.extra.DATA
      24: invokevirtual #108                // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      27: putfield      #29                 // Field a:Ljava/lang/Object;
      30: return
      31: aload_0
      32: iload_1
      33: iload_2
      34: aload_3
      35: invokespecial #110                // Method ryey/easer/core/ui/data/c.onActivityResult:(IILandroid/content/Intent;)V
      38: return

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #113                // Method ryey/easer/core/ui/data/c.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: new           #115                // class ryey/easer/core/f
       9: dup
      10: aload_0
      11: invokevirtual #119                // Method getContext:()Landroid/content/Context;
      14: invokespecial #122                // Method ryey/easer/core/f."<init>":(Landroid/content/Context;)V
      17: putfield      #124                // Field b:Lryey/easer/core/f;
      20: aload_0
      21: getfield      #124                // Field b:Lryey/easer/core/f;
      24: invokevirtual #126                // Method ryey/easer/core/f.a:()V
      27: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #129                // int 2131427396
       3: aload_2
       4: iconst_0
       5: invokevirtual #135                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #136                // int 2131296341
      13: invokevirtual #142                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #55                 // class android/widget/CheckBox
      19: putfield      #53                 // Field d:Landroid/widget/CheckBox;
      22: aload_1
      23: ldc           #143                // int 2131296314
      25: invokevirtual #142                // Method android/view/View.findViewById:(I)Landroid/view/View;
      28: checkcast     #145                // class android/widget/Button
      31: astore_2
      32: getstatic     #147                // Field c:Z
      35: ifne          53
      38: aload_0
      39: invokevirtual #84                 // Method getArguments:()Landroid/os/Bundle;
      42: ifnonnull     53
      45: new           #149                // class java/lang/AssertionError
      48: dup
      49: invokespecial #150                // Method java/lang/AssertionError."<init>":()V
      52: athrow
      53: aload_0
      54: aload_0
      55: invokevirtual #84                 // Method getArguments:()Landroid/os/Bundle;
      58: ldc           #42                 // String ryey.easer.core.ui.data.profile.RemoteOperationPluginViewContainerFragment.args.TYPE
      60: invokevirtual #153                // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
      63: putfield      #29                 // Field a:Ljava/lang/Object;
      66: aload_2
      67: new           #7                  // class ryey/easer/core/ui/data/profile/d$1
      70: dup
      71: aload_0
      72: aload_0
      73: invokevirtual #84                 // Method getArguments:()Landroid/os/Bundle;
      76: ldc           #36                 // String ryey.easer.core.ui.data.profile.RemoteOperationPluginViewContainerFragment.args.ID
      78: invokevirtual #88                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      81: invokespecial #156                // Method ryey/easer/core/ui/data/profile/d$1."<init>":(Lryey/easer/core/ui/data/profile/d;Ljava/lang/String;)V
      84: invokevirtual #160                // Method android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      87: aload_1
      88: areturn

  public void onDestroy();
    Code:
       0: aload_0
       1: invokespecial #163                // Method ryey/easer/core/ui/data/c.onDestroy:()V
       4: aload_0
       5: getfield      #124                // Field b:Lryey/easer/core/f;
       8: invokevirtual #165                // Method ryey/easer/core/f.b:()V
      11: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #169                // Method ryey/easer/core/ui/data/c.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
       6: aload_1
       7: ldc           #170                // int 2131296740
       9: invokevirtual #142                // Method android/view/View.findViewById:(I)Landroid/view/View;
      12: checkcast     #172                // class android/widget/TextView
      15: astore_1
      16: aload_0
      17: invokevirtual #84                 // Method getArguments:()Landroid/os/Bundle;
      20: ldc           #36                 // String ryey.easer.core.ui.data.profile.RemoteOperationPluginViewContainerFragment.args.ID
      22: invokevirtual #88                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      25: astore_2
      26: aload_0
      27: getfield      #124                // Field b:Lryey/easer/core/f;
      30: aload_2
      31: new           #11                 // class ryey/easer/core/ui/data/profile/d$2
      34: dup
      35: aload_0
      36: aload_1
      37: invokespecial #175                // Method ryey/easer/core/ui/data/profile/d$2."<init>":(Lryey/easer/core/ui/data/profile/d;Landroid/widget/TextView;)V
      40: invokevirtual #178                // Method ryey/easer/core/f.a:(Ljava/lang/String;Lryey/easer/core/f$g;)V
      43: return
}
