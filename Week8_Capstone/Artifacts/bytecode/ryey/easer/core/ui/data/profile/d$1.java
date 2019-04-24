class ryey.easer.core.ui.data.profile.d$1 implements android.view.View$OnClickListener {
  final java.lang.String a;

  final ryey.easer.core.ui.data.profile.d b;

  ryey.easer.core.ui.data.profile.d$1(ryey.easer.core.ui.data.profile.d, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field b:Lryey/easer/core/ui/data/profile/d;
       5: aload_0
       6: aload_2
       7: putfield      #23                 // Field a:Ljava/lang/String;
      10: aload_0
      11: invokespecial #26                 // Method java/lang/Object."<init>":()V
      14: return

  public void onClick(android.view.View);
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:Lryey/easer/core/ui/data/profile/d;
       4: getfield      #32                 // Field ryey/easer/core/ui/data/profile/d.b:Lryey/easer/core/f;
       7: aload_0
       8: getfield      #23                 // Field a:Ljava/lang/String;
      11: new           #13                 // class ryey/easer/core/ui/data/profile/d$1$1
      14: dup
      15: aload_0
      16: invokespecial #35                 // Method ryey/easer/core/ui/data/profile/d$1$1."<init>":(Lryey/easer/core/ui/data/profile/d$1;)V
      19: invokevirtual #40                 // Method ryey/easer/core/f.a:(Ljava/lang/String;Lryey/easer/core/f$d;)V
      22: return
}
