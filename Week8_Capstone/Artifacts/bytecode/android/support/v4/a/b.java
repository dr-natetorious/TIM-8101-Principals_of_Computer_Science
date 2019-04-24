public class android.support.v4.a.b<D> {
  int a;

  android.support.v4.a.b$a<D> b;

  boolean c;

  boolean d;

  boolean e;

  boolean f;

  boolean g;

  public java.lang.String a(D);
    Code:
       0: new           #21                 // class java/lang/StringBuilder
       3: dup
       4: bipush        64
       6: invokespecial #25                 // Method java/lang/StringBuilder."<init>":(I)V
       9: astore_2
      10: aload_1
      11: aload_2
      12: invokestatic  #30                 // Method android/support/v4/g/d.a:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
      15: aload_2
      16: ldc           #32                 // String }
      18: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_2
      23: invokevirtual #40                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      26: areturn

  public final void a();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #46                 // Field c:Z
       5: aload_0
       6: iconst_0
       7: putfield      #48                 // Field e:Z
      10: aload_0
      11: iconst_0
      12: putfield      #50                 // Field d:Z
      15: aload_0
      16: invokevirtual #52                 // Method b:()V
      19: return

  public void a(android.support.v4.a.b$a<D>);
    Code:
       0: aload_0
       1: getfield      #55                 // Field b:Landroid/support/v4/a/b$a;
       4: ifnonnull     17
       7: new           #57                 // class java/lang/IllegalStateException
      10: dup
      11: ldc           #59                 // String No listener register
      13: invokespecial #62                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: aload_0
      18: getfield      #55                 // Field b:Landroid/support/v4/a/b$a;
      21: aload_1
      22: if_acmpeq     35
      25: new           #64                 // class java/lang/IllegalArgumentException
      28: dup
      29: ldc           #66                 // String Attempting to unregister the wrong listener
      31: invokespecial #67                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      34: athrow
      35: aload_0
      36: aconst_null
      37: putfield      #55                 // Field b:Landroid/support/v4/a/b$a;
      40: return

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_3
       1: aload_1
       2: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
       5: aload_3
       6: ldc           #76                 // String mId=
       8: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      11: aload_3
      12: aload_0
      13: getfield      #78                 // Field a:I
      16: invokevirtual #80                 // Method java/io/PrintWriter.print:(I)V
      19: aload_3
      20: ldc           #82                 // String  mListener=
      22: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      25: aload_3
      26: aload_0
      27: getfield      #55                 // Field b:Landroid/support/v4/a/b$a;
      30: invokevirtual #86                 // Method java/io/PrintWriter.println:(Ljava/lang/Object;)V
      33: aload_0
      34: getfield      #46                 // Field c:Z
      37: ifne          54
      40: aload_0
      41: getfield      #88                 // Field f:Z
      44: ifne          54
      47: aload_0
      48: getfield      #90                 // Field g:Z
      51: ifeq          101
      54: aload_3
      55: aload_1
      56: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      59: aload_3
      60: ldc           #92                 // String mStarted=
      62: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      65: aload_3
      66: aload_0
      67: getfield      #46                 // Field c:Z
      70: invokevirtual #95                 // Method java/io/PrintWriter.print:(Z)V
      73: aload_3
      74: ldc           #97                 // String  mContentChanged=
      76: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      79: aload_3
      80: aload_0
      81: getfield      #88                 // Field f:Z
      84: invokevirtual #95                 // Method java/io/PrintWriter.print:(Z)V
      87: aload_3
      88: ldc           #99                 // String  mProcessingChange=
      90: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      93: aload_3
      94: aload_0
      95: getfield      #90                 // Field g:Z
      98: invokevirtual #101                // Method java/io/PrintWriter.println:(Z)V
     101: aload_0
     102: getfield      #50                 // Field d:Z
     105: ifne          115
     108: aload_0
     109: getfield      #48                 // Field e:Z
     112: ifeq          148
     115: aload_3
     116: aload_1
     117: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     120: aload_3
     121: ldc           #103                // String mAbandoned=
     123: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     126: aload_3
     127: aload_0
     128: getfield      #50                 // Field d:Z
     131: invokevirtual #95                 // Method java/io/PrintWriter.print:(Z)V
     134: aload_3
     135: ldc           #105                // String  mReset=
     137: invokevirtual #74                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     140: aload_3
     141: aload_0
     142: getfield      #48                 // Field e:Z
     145: invokevirtual #101                // Method java/io/PrintWriter.println:(Z)V
     148: return

  protected void b();
    Code:
       0: return

  public boolean c();
    Code:
       0: aload_0
       1: invokevirtual #108                // Method d:()Z
       4: ireturn

  protected boolean d();
    Code:
       0: iconst_0
       1: ireturn

  public void e();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #46                 // Field c:Z
       5: aload_0
       6: invokevirtual #110                // Method f:()V
       9: return

  protected void f();
    Code:
       0: return

  public void g();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #50                 // Field d:Z
       5: aload_0
       6: invokevirtual #113                // Method h:()V
       9: return

  protected void h();
    Code:
       0: return

  public void i();
    Code:
       0: aload_0
       1: invokevirtual #117                // Method j:()V
       4: aload_0
       5: iconst_1
       6: putfield      #48                 // Field e:Z
       9: aload_0
      10: iconst_0
      11: putfield      #46                 // Field c:Z
      14: aload_0
      15: iconst_0
      16: putfield      #50                 // Field d:Z
      19: aload_0
      20: iconst_0
      21: putfield      #88                 // Field f:Z
      24: aload_0
      25: iconst_0
      26: putfield      #90                 // Field g:Z
      29: return

  protected void j();
    Code:
       0: return

  public java.lang.String toString();
    Code:
       0: new           #21                 // class java/lang/StringBuilder
       3: dup
       4: bipush        64
       6: invokespecial #25                 // Method java/lang/StringBuilder."<init>":(I)V
       9: astore_1
      10: aload_0
      11: aload_1
      12: invokestatic  #30                 // Method android/support/v4/g/d.a:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
      15: aload_1
      16: ldc           #119                // String  id=
      18: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_1
      23: aload_0
      24: getfield      #78                 // Field a:I
      27: invokevirtual #122                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: ldc           #32                 // String }
      34: invokevirtual #36                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: aload_1
      39: invokevirtual #40                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      42: areturn
}
