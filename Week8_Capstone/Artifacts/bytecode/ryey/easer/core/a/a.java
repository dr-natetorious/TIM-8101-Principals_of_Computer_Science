public class ryey.easer.core.a.a implements ryey.easer.core.a.f,ryey.easer.core.a.l {
  public final java.lang.String a;

  public final boolean b;

  public final boolean c;

  public final boolean d;

  public ryey.easer.core.a.a(java.lang.String, boolean, boolean, boolean);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #21                 // Field a:Ljava/lang/String;
       9: aload_0
      10: iload_2
      11: putfield      #23                 // Field b:Z
      14: aload_0
      15: iload_3
      16: putfield      #25                 // Field c:Z
      19: aload_0
      20: iload         4
      22: putfield      #27                 // Field d:Z
      25: return

  public static ryey.easer.core.a.a a(ryey.easer.core.a.j);
    Code:
       0: new           #2                  // class ryey/easer/core/a/a
       3: dup
       4: aload_0
       5: getfield      #32                 // Field ryey/easer/core/a/j.a:Ljava/lang/String;
       8: aload_0
       9: getfield      #33                 // Field ryey/easer/core/a/j.b:Z
      12: aload_0
      13: invokevirtual #36                 // Method ryey/easer/core/a/j.b:()Z
      16: aload_0
      17: invokevirtual #39                 // Method ryey/easer/core/a/j.f:()Z
      20: invokespecial #41                 // Method "<init>":(Ljava/lang/String;ZZZ)V
      23: areturn

  public java.lang.String a();
    Code:
       0: aconst_null
       1: areturn

  public boolean b();
    Code:
       0: iconst_0
       1: ireturn
}
