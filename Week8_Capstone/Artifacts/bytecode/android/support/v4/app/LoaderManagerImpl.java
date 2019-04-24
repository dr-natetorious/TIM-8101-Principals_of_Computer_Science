class android.support.v4.app.LoaderManagerImpl extends android.support.v4.app.z {
  static boolean a;

  static {};
    Code:
       0: return

  android.support.v4.app.LoaderManagerImpl(android.arch.lifecycle.e, android.arch.lifecycle.p);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method android/support/v4/app/z."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #29                 // Field b:Landroid/arch/lifecycle/e;
       9: aload_0
      10: aload_2
      11: invokestatic  #32                 // Method android/support/v4/app/LoaderManagerImpl$LoaderViewModel.a:(Landroid/arch/lifecycle/p;)Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;
      14: putfield      #34                 // Field c:Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;
      17: return

  void a();
    Code:
       0: aload_0
       1: getfield      #34                 // Field c:Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;
       4: invokevirtual #36                 // Method android/support/v4/app/LoaderManagerImpl$LoaderViewModel.b:()V
       7: return

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_0
       1: getfield      #34                 // Field c:Landroid/support/v4/app/LoaderManagerImpl$LoaderViewModel;
       4: aload_1
       5: aload_2
       6: aload_3
       7: aload         4
       9: invokevirtual #39                 // Method android/support/v4/app/LoaderManagerImpl$LoaderViewModel.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
      12: return

  public java.lang.String toString();
    Code:
       0: new           #43                 // class java/lang/StringBuilder
       3: dup
       4: sipush        128
       7: invokespecial #46                 // Method java/lang/StringBuilder."<init>":(I)V
      10: astore_1
      11: aload_1
      12: ldc           #48                 // String LoaderManager{
      14: invokevirtual #52                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: pop
      18: aload_1
      19: aload_0
      20: invokestatic  #58                 // Method java/lang/System.identityHashCode:(Ljava/lang/Object;)I
      23: invokestatic  #64                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      26: invokevirtual #52                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_1
      31: ldc           #66                 // String  in
      33: invokevirtual #52                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: aload_0
      38: getfield      #29                 // Field b:Landroid/arch/lifecycle/e;
      41: aload_1
      42: invokestatic  #71                 // Method android/support/v4/g/d.a:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
      45: aload_1
      46: ldc           #73                 // String }}
      48: invokevirtual #52                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: aload_1
      53: invokevirtual #75                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      56: areturn
}
