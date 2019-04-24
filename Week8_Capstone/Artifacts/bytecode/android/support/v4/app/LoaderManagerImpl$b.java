class android.support.v4.app.LoaderManagerImpl$b<D> implements android.arch.lifecycle.k<D> {
  public void a(D);
    Code:
       0: getstatic     #20                 // Field android/support/v4/app/LoaderManagerImpl.a:Z
       3: ifeq          60
       6: new           #22                 // class java/lang/StringBuilder
       9: dup
      10: invokespecial #26                 // Method java/lang/StringBuilder."<init>":()V
      13: astore_2
      14: aload_2
      15: ldc           #28                 // String   onLoadFinished in
      17: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_2
      22: aload_0
      23: getfield      #34                 // Field a:Landroid/support/v4/a/b;
      26: invokevirtual #37                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_2
      31: ldc           #39                 // String :
      33: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: aload_2
      38: aload_0
      39: getfield      #34                 // Field a:Landroid/support/v4/a/b;
      42: aload_1
      43: invokevirtual #44                 // Method android/support/v4/a/b.a:(Ljava/lang/Object;)Ljava/lang/String;
      46: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      49: pop
      50: ldc           #46                 // String LoaderManager
      52: aload_2
      53: invokevirtual #50                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      56: invokestatic  #56                 // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      59: pop
      60: aload_0
      61: getfield      #58                 // Field b:Landroid/support/v4/app/z$a;
      64: aload_0
      65: getfield      #34                 // Field a:Landroid/support/v4/a/b;
      68: aload_1
      69: invokeinterface #63,  3           // InterfaceMethod android/support/v4/app/z$a.a:(Landroid/support/v4/a/b;Ljava/lang/Object;)V
      74: aload_0
      75: iconst_1
      76: putfield      #65                 // Field c:Z
      79: return

  public void a(java.lang.String, java.io.PrintWriter);
    Code:
       0: aload_2
       1: aload_1
       2: invokevirtual #75                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
       5: aload_2
       6: ldc           #77                 // String mDeliveredData=
       8: invokevirtual #75                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      11: aload_2
      12: aload_0
      13: getfield      #65                 // Field c:Z
      16: invokevirtual #81                 // Method java/io/PrintWriter.println:(Z)V
      19: return

  boolean a();
    Code:
       0: aload_0
       1: getfield      #65                 // Field c:Z
       4: ireturn

  void b();
    Code:
       0: aload_0
       1: getfield      #65                 // Field c:Z
       4: ifeq          60
       7: getstatic     #20                 // Field android/support/v4/app/LoaderManagerImpl.a:Z
      10: ifeq          47
      13: new           #22                 // class java/lang/StringBuilder
      16: dup
      17: invokespecial #26                 // Method java/lang/StringBuilder."<init>":()V
      20: astore_1
      21: aload_1
      22: ldc           #84                 // String   Resetting:
      24: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      27: pop
      28: aload_1
      29: aload_0
      30: getfield      #34                 // Field a:Landroid/support/v4/a/b;
      33: invokevirtual #37                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      36: pop
      37: ldc           #46                 // String LoaderManager
      39: aload_1
      40: invokevirtual #50                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      43: invokestatic  #56                 // Method android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
      46: pop
      47: aload_0
      48: getfield      #58                 // Field b:Landroid/support/v4/app/z$a;
      51: aload_0
      52: getfield      #34                 // Field a:Landroid/support/v4/a/b;
      55: invokeinterface #87,  2           // InterfaceMethod android/support/v4/app/z$a.a:(Landroid/support/v4/a/b;)V
      60: return

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #58                 // Field b:Landroid/support/v4/app/z$a;
       4: invokevirtual #88                 // Method java/lang/Object.toString:()Ljava/lang/String;
       7: areturn
}
