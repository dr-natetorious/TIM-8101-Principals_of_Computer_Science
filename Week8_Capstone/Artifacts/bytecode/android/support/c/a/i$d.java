class android.support.c.a.i$d {
  protected android.support.v4.b.b$b[] m;

  java.lang.String n;

  int o;

  public android.support.c.a.i$d();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
       9: return

  public android.support.c.a.i$d(android.support.c.a.i$d);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
       9: aload_0
      10: aload_1
      11: getfield      #23                 // Field n:Ljava/lang/String;
      14: putfield      #23                 // Field n:Ljava/lang/String;
      17: aload_0
      18: aload_1
      19: getfield      #25                 // Field o:I
      22: putfield      #25                 // Field o:I
      25: aload_0
      26: aload_1
      27: getfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
      30: invokestatic  #31                 // Method android/support/v4/b/b.a:([Landroid/support/v4/b/b$b;)[Landroid/support/v4/b/b$b;
      33: putfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
      36: return

  public void a(android.graphics.Path);
    Code:
       0: aload_1
       1: invokevirtual #37                 // Method android/graphics/Path.reset:()V
       4: aload_0
       5: getfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
       8: ifnull        19
      11: aload_0
      12: getfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
      15: aload_1
      16: invokestatic  #42                 // Method android/support/v4/b/b$b.a:([Landroid/support/v4/b/b$b;Landroid/graphics/Path;)V
      19: return

  public boolean a();
    Code:
       0: iconst_0
       1: ireturn

  public android.support.v4.b.b$b[] getPathData();
    Code:
       0: aload_0
       1: getfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
       4: areturn

  public java.lang.String getPathName();
    Code:
       0: aload_0
       1: getfield      #23                 // Field n:Ljava/lang/String;
       4: areturn

  public void setPathData(android.support.v4.b.b$b[]);
    Code:
       0: aload_0
       1: getfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
       4: aload_1
       5: invokestatic  #52                 // Method android/support/v4/b/b.a:([Landroid/support/v4/b/b$b;[Landroid/support/v4/b/b$b;)Z
       8: ifne          20
      11: aload_0
      12: aload_1
      13: invokestatic  #31                 // Method android/support/v4/b/b.a:([Landroid/support/v4/b/b$b;)[Landroid/support/v4/b/b$b;
      16: putfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
      19: return
      20: aload_0
      21: getfield      #19                 // Field m:[Landroid/support/v4/b/b$b;
      24: aload_1
      25: invokestatic  #56                 // Method android/support/v4/b/b.b:([Landroid/support/v4/b/b$b;[Landroid/support/v4/b/b$b;)V
      28: return
}
