class android.support.v4.app.LoaderManagerImpl$LoaderViewModel extends android.arch.lifecycle.n {
  static {};
    Code:
       0: new           #9                  // class android/support/v4/app/LoaderManagerImpl$LoaderViewModel$1
       3: dup
       4: invokespecial #19                 // Method android/support/v4/app/LoaderManagerImpl$LoaderViewModel$1."<init>":()V
       7: putstatic     #21                 // Field a:Landroid/arch/lifecycle/o$a;
      10: return

  android.support.v4.app.LoaderManagerImpl$LoaderViewModel();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method android/arch/lifecycle/n."<init>":()V
       4: aload_0
       5: new           #25                 // class android/support/v4/g/n
       8: dup
       9: invokespecial #26                 // Method android/support/v4/g/n."<init>":()V
      12: putfield      #28                 // Field b:Landroid/support/v4/g/n;
      15: return

  static android.support.v4.app.LoaderManagerImpl$LoaderViewModel a(android.arch.lifecycle.p);
    Code:
       0: new           #31                 // class android/arch/lifecycle/o
       3: dup
       4: aload_0
       5: getstatic     #21                 // Field a:Landroid/arch/lifecycle/o$a;
       8: invokespecial #34                 // Method android/arch/lifecycle/o."<init>":(Landroid/arch/lifecycle/p;Landroid/arch/lifecycle/o$a;)V
      11: ldc           #2                  // class android/support/v4/app/LoaderManagerImpl$LoaderViewModel
      13: invokevirtual #37                 // Method android/arch/lifecycle/o.a:(Ljava/lang/Class;)Landroid/arch/lifecycle/n;
      16: checkcast     #2                  // class android/support/v4/app/LoaderManagerImpl$LoaderViewModel
      19: areturn

  protected void a();
    Code:
       0: aload_0
       1: invokespecial #39                 // Method android/arch/lifecycle/n.a:()V
       4: aload_0
       5: getfield      #28                 // Field b:Landroid/support/v4/g/n;
       8: invokevirtual #42                 // Method android/support/v4/g/n.b:()I
      11: istore_2
      12: iconst_0
      13: istore_1
      14: iload_1
      15: iload_2
      16: if_icmpge     42
      19: aload_0
      20: getfield      #28                 // Field b:Landroid/support/v4/g/n;
      23: iload_1
      24: invokevirtual #46                 // Method android/support/v4/g/n.e:(I)Ljava/lang/Object;
      27: checkcast     #48                 // class android/support/v4/app/LoaderManagerImpl$a
      30: iconst_1
      31: invokevirtual #51                 // Method android/support/v4/app/LoaderManagerImpl$a.a:(Z)Landroid/support/v4/a/b;
      34: pop
      35: iload_1
      36: iconst_1
      37: iadd
      38: istore_1
      39: goto          14
      42: aload_0
      43: getfield      #28                 // Field b:Landroid/support/v4/g/n;
      46: invokevirtual #54                 // Method android/support/v4/g/n.c:()V
      49: return

  public void a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]);
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:Landroid/support/v4/g/n;
       4: invokevirtual #42                 // Method android/support/v4/g/n.b:()I
       7: ifle          140
      10: aload_3
      11: aload_1
      12: invokevirtual #61                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      15: aload_3
      16: ldc           #63                 // String Loaders:
      18: invokevirtual #66                 // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
      21: new           #68                 // class java/lang/StringBuilder
      24: dup
      25: invokespecial #69                 // Method java/lang/StringBuilder."<init>":()V
      28: astore        6
      30: aload         6
      32: aload_1
      33: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      36: pop
      37: aload         6
      39: ldc           #75                 // String
      41: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      44: pop
      45: aload         6
      47: invokevirtual #79                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      50: astore        6
      52: iconst_0
      53: istore        5
      55: iload         5
      57: aload_0
      58: getfield      #28                 // Field b:Landroid/support/v4/g/n;
      61: invokevirtual #42                 // Method android/support/v4/g/n.b:()I
      64: if_icmpge     140
      67: aload_0
      68: getfield      #28                 // Field b:Landroid/support/v4/g/n;
      71: iload         5
      73: invokevirtual #46                 // Method android/support/v4/g/n.e:(I)Ljava/lang/Object;
      76: checkcast     #48                 // class android/support/v4/app/LoaderManagerImpl$a
      79: astore        7
      81: aload_3
      82: aload_1
      83: invokevirtual #61                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      86: aload_3
      87: ldc           #81                 // String   #
      89: invokevirtual #61                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
      92: aload_3
      93: aload_0
      94: getfield      #28                 // Field b:Landroid/support/v4/g/n;
      97: iload         5
      99: invokevirtual #85                 // Method android/support/v4/g/n.d:(I)I
     102: invokevirtual #88                 // Method java/io/PrintWriter.print:(I)V
     105: aload_3
     106: ldc           #90                 // String :
     108: invokevirtual #61                 // Method java/io/PrintWriter.print:(Ljava/lang/String;)V
     111: aload_3
     112: aload         7
     114: invokevirtual #91                 // Method android/support/v4/app/LoaderManagerImpl$a.toString:()Ljava/lang/String;
     117: invokevirtual #66                 // Method java/io/PrintWriter.println:(Ljava/lang/String;)V
     120: aload         7
     122: aload         6
     124: aload_2
     125: aload_3
     126: aload         4
     128: invokevirtual #93                 // Method android/support/v4/app/LoaderManagerImpl$a.a:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
     131: iload         5
     133: iconst_1
     134: iadd
     135: istore        5
     137: goto          55
     140: return

  void b();
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:Landroid/support/v4/g/n;
       4: invokevirtual #42                 // Method android/support/v4/g/n.b:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     36
      15: aload_0
      16: getfield      #28                 // Field b:Landroid/support/v4/g/n;
      19: iload_1
      20: invokevirtual #46                 // Method android/support/v4/g/n.e:(I)Ljava/lang/Object;
      23: checkcast     #48                 // class android/support/v4/app/LoaderManagerImpl$a
      26: invokevirtual #96                 // Method android/support/v4/app/LoaderManagerImpl$a.f:()V
      29: iload_1
      30: iconst_1
      31: iadd
      32: istore_1
      33: goto          10
      36: return
}
