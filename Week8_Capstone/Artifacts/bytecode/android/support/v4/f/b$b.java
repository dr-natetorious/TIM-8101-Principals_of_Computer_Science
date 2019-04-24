public class android.support.v4.f.b$b {
  public android.support.v4.f.b$b(android.net.Uri, int, int, boolean, int);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #24                 // Method android/support/v4/g/l.a:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #26                 // class android/net/Uri
      12: putfield      #28                 // Field a:Landroid/net/Uri;
      15: aload_0
      16: iload_2
      17: putfield      #30                 // Field b:I
      20: aload_0
      21: iload_3
      22: putfield      #32                 // Field c:I
      25: aload_0
      26: iload         4
      28: putfield      #34                 // Field d:Z
      31: aload_0
      32: iload         5
      34: putfield      #36                 // Field e:I
      37: return

  public android.net.Uri a();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Landroid/net/Uri;
       4: areturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #30                 // Field b:I
       4: ireturn

  public int c();
    Code:
       0: aload_0
       1: getfield      #32                 // Field c:I
       4: ireturn

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #34                 // Field d:Z
       4: ireturn

  public int e();
    Code:
       0: aload_0
       1: getfield      #36                 // Field e:I
       4: ireturn
}
