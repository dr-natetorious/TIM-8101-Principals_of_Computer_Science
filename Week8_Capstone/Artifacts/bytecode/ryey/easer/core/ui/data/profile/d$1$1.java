class ryey.easer.core.ui.data.profile.d$1$1 implements ryey.easer.core.f$d {
  final ryey.easer.core.ui.data.profile.d$1 a;

  ryey.easer.core.ui.data.profile.d$1$1(ryey.easer.core.ui.data.profile.d$1);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/d$1;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.content.Intent);
    Code:
       0: aload_1
       1: ldc           #24                 // String ryey.easer.remote_plugin.extra.DATA
       3: aload_0
       4: getfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/d$1;
       7: getfield      #28                 // Field ryey/easer/core/ui/data/profile/d$1.b:Lryey/easer/core/ui/data/profile/d;
      10: invokestatic  #33                 // Method ryey/easer/core/ui/data/profile/d.a:(Lryey/easer/core/ui/data/profile/d;)Ljava/lang/Object;
      13: checkcast     #35                 // class android/os/Parcelable
      16: invokevirtual #41                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
      19: pop
      20: aload_0
      21: getfield      #17                 // Field a:Lryey/easer/core/ui/data/profile/d$1;
      24: getfield      #28                 // Field ryey/easer/core/ui/data/profile/d$1.b:Lryey/easer/core/ui/data/profile/d;
      27: aload_1
      28: bipush        10
      30: invokevirtual #45                 // Method ryey/easer/core/ui/data/profile/d.startActivityForResult:(Landroid/content/Intent;I)V
      33: return
}
