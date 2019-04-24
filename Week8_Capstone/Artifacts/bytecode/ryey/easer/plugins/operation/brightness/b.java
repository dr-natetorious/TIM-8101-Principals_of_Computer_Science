public class ryey.easer.plugins.operation.brightness.b extends ryey.easer.plugins.operation.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.brightness.b> CREATOR;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/operation/brightness/b$1
       3: dup
       4: invokespecial #14                 // Method ryey/easer/plugins/operation/brightness/b$1."<init>":()V
       7: putstatic     #16                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.brightness.b(android.os.Parcel, ryey.easer.plugins.operation.brightness.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #35                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  public ryey.easer.plugins.operation.brightness.b(java.lang.Integer);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #38                 // Method ryey/easer/plugins/operation/b."<init>":(Ljava/lang/Integer;)V
       5: aload_0
       6: iconst_m1
       7: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      10: putfield      #30                 // Field b:Ljava/lang/Integer;
      13: aload_0
      14: sipush        255
      17: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      20: putfield      #33                 // Field c:Ljava/lang/Integer;
      23: return

  ryey.easer.plugins.operation.brightness.b(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #41                 // Method ryey/easer/plugins/operation/b."<init>":(Ljava/lang/String;Lryey/easer/b/a;I)V
       7: aload_0
       8: iconst_m1
       9: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      12: putfield      #30                 // Field b:Ljava/lang/Integer;
      15: aload_0
      16: sipush        255
      19: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      22: putfield      #33                 // Field c:Ljava/lang/Integer;
      25: return

  public ryey.easer.plugins.operation.brightness.b(boolean);
    Code:
       0: aload_0
       1: iconst_m1
       2: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       5: invokespecial #38                 // Method ryey/easer/plugins/operation/b."<init>":(Ljava/lang/Integer;)V
       8: aload_0
       9: iconst_m1
      10: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      13: putfield      #30                 // Field b:Ljava/lang/Integer;
      16: aload_0
      17: sipush        255
      20: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      23: putfield      #33                 // Field c:Ljava/lang/Integer;
      26: return

  public boolean a();
    Code:
       0: aload_0
       1: invokespecial #46                 // Method ryey/easer/plugins/operation/b.a:()Z
       4: ireturn

  boolean c();
    Code:
       0: aload_0
       1: invokevirtual #50                 // Method d:()Ljava/lang/Integer;
       4: iconst_m1
       5: invokestatic  #26                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       8: invokevirtual #54                 // Method java/lang/Integer.equals:(Ljava/lang/Object;)Z
      11: ireturn
}
