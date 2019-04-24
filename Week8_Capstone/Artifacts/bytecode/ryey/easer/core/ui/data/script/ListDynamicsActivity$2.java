class ryey.easer.core.ui.data.script.ListDynamicsActivity$2 implements android.view.View$OnClickListener {
  final ryey.easer.core.ui.data.script.ListDynamicsActivity a;

  ryey.easer.core.ui.data.script.ListDynamicsActivity$2(ryey.easer.core.ui.data.script.ListDynamicsActivity);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: new           #25                 // class ryey/easer/commons/local_plugin/b/b
       3: dup
       4: invokespecial #26                 // Method ryey/easer/commons/local_plugin/b/b."<init>":()V
       7: astore_1
       8: aload_0
       9: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
      12: getfield      #30                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity.c:Ljava/util/List;
      15: invokeinterface #36,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      20: astore_2
      21: aload_2
      22: invokeinterface #42,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      27: ifeq          55
      30: aload_2
      31: invokeinterface #46,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      36: checkcast     #48                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$b
      39: astore_3
      40: aload_1
      41: aload_3
      42: getfield      #51                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.a:Ljava/lang/String;
      45: aload_3
      46: getfield      #54                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.b:Ljava/lang/String;
      49: invokevirtual #57                 // Method ryey/easer/commons/local_plugin/b/b.a:(Ljava/lang/String;Ljava/lang/String;)V
      52: goto          21
      55: new           #59                 // class android/content/Intent
      58: dup
      59: invokespecial #60                 // Method android/content/Intent."<init>":()V
      62: astore_2
      63: aload_2
      64: ldc           #62                 // String ryey.easer.core.ui.data.extra.DYNAMICS_LINK
      66: aload_1
      67: invokevirtual #66                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
      70: pop
      71: aload_0
      72: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
      75: iconst_m1
      76: aload_2
      77: invokevirtual #70                 // Method ryey/easer/core/ui/data/script/ListDynamicsActivity.setResult:(ILandroid/content/Intent;)V
      80: aload_0
      81: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
      84: invokevirtual #73                 // Method ryey/easer/core/ui/data/script/ListDynamicsActivity.finish:()V
      87: return
}
