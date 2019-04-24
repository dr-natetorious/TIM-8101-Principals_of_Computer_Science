public class ryey.easer.core.a.a.a.a.d.a implements ryey.easer.core.a.a.a.h {
  public ryey.easer.core.a.a.a.a.d.a(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #19                 // Field a:Landroid/content/Context;
       9: aload_1
      10: invokevirtual #25                 // Method android/content/Context.getFilesDir:()Ljava/io/File;
      13: ldc           #27                 // String script
      15: invokestatic  #32                 // Method ryey/easer/core/a/a/a/e.a:(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
      18: putstatic     #34                 // Field b:Ljava/io/File;
      21: return

  public java.util.List<java.lang.String> a();
    Code:
       0: new           #50                 // class java/util/ArrayList
       3: dup
       4: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
       7: astore_1
       8: aload_0
       9: invokevirtual #53                 // Method b:()Ljava/util/List;
      12: invokeinterface #59,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      17: astore_2
      18: aload_2
      19: invokeinterface #65,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      24: ifeq          47
      27: aload_1
      28: aload_2
      29: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      34: checkcast     #47                 // class ryey/easer/core/a/j
      37: invokevirtual #72                 // Method ryey/easer/core/a/j.a:()Ljava/lang/String;
      40: invokevirtual #76                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      43: pop
      44: goto          18
      47: aload_1
      48: areturn

  public void a(ryey.easer.core.a.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #47                 // class ryey/easer/core/a/j
       5: invokevirtual #82                 // Method a:(Lryey/easer/core/a/j;)V
       8: return

  public void a(ryey.easer.core.a.j);
    Code:
       0: getstatic     #34                 // Field b:Ljava/io/File;
       3: astore_2
       4: new           #84                 // class java/lang/StringBuilder
       7: dup
       8: invokespecial #85                 // Method java/lang/StringBuilder."<init>":()V
      11: astore_3
      12: aload_3
      13: aload_1
      14: invokevirtual #72                 // Method ryey/easer/core/a/j.a:()Ljava/lang/String;
      17: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      20: pop
      21: aload_3
      22: ldc           #91                 // String .json
      24: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      27: pop
      28: new           #93                 // class java/io/File
      31: dup
      32: aload_2
      33: aload_3
      34: invokevirtual #96                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      37: invokespecial #99                 // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
      40: astore_2
      41: new           #101                // class ryey/easer/core/a/a/a/a/d/c
      44: dup
      45: invokespecial #102                // Method ryey/easer/core/a/a/a/a/d/c."<init>":()V
      48: aload_2
      49: aload_1
      50: invokestatic  #105                // Method ryey/easer/core/a/a/a/d.a:(Lryey/easer/core/a/a/a/i;Ljava/io/File;Ljava/lang/Object;)V
      53: return

  public boolean a(java.lang.String);
    Code:
       0: getstatic     #34                 // Field b:Ljava/io/File;
       3: astore_2
       4: new           #84                 // class java/lang/StringBuilder
       7: dup
       8: invokespecial #85                 // Method java/lang/StringBuilder."<init>":()V
      11: astore_3
      12: aload_3
      13: aload_1
      14: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: pop
      18: aload_3
      19: ldc           #91                 // String .json
      21: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_2
      26: aload_3
      27: invokevirtual #96                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      30: invokestatic  #109                // Method ryey/easer/core/a/a/a/e.b:(Ljava/io/File;Ljava/lang/String;)Z
      33: ireturn

  public java.util.List<ryey.easer.core.a.j> b();
    Code:
       0: new           #50                 // class java/util/ArrayList
       3: dup
       4: invokespecial #51                 // Method java/util/ArrayList."<init>":()V
       7: astore_3
       8: getstatic     #34                 // Field b:Ljava/io/File;
      11: new           #8                  // class ryey/easer/core/a/a/a/a/d/a$1
      14: dup
      15: aload_0
      16: invokespecial #116                // Method ryey/easer/core/a/a/a/a/d/a$1."<init>":(Lryey/easer/core/a/a/a/a/d/a;)V
      19: invokevirtual #120                // Method java/io/File.listFiles:(Ljava/io/FileFilter;)[Ljava/io/File;
      22: astore        4
      24: aload         4
      26: arraylength
      27: istore_2
      28: iconst_0
      29: istore_1
      30: iload_1
      31: iload_2
      32: if_icmpge     84
      35: aload         4
      37: iload_1
      38: aaload
      39: astore        5
      41: aload_3
      42: aload_0
      43: aload         5
      45: invokespecial #122                // Method a:(Ljava/io/File;)Lryey/easer/core/a/j;
      48: invokeinterface #123,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      53: pop
      54: goto          77
      57: astore_3
      58: new           #125                // class java/lang/IllegalStateException
      61: dup
      62: aload_3
      63: invokevirtual #129                // Method java/io/FileNotFoundException.getCause:()Ljava/lang/Throwable;
      66: invokespecial #132                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      69: athrow
      70: astore        5
      72: aload         5
      74: invokestatic  #136                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      77: iload_1
      78: iconst_1
      79: iadd
      80: istore_1
      81: goto          30
      84: aload_3
      85: areturn
    Exception table:
       from    to  target type
          41    54    70   Class ryey/easer/commons/local_plugin/b
          41    54    57   Class java/io/FileNotFoundException

  public ryey.easer.core.a.f b(java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #142                // Method d:(Ljava/lang/String;)Lryey/easer/core/a/j;
       5: areturn

  public void c(java.lang.String);
    Code:
       0: getstatic     #34                 // Field b:Ljava/io/File;
       3: astore_2
       4: new           #84                 // class java/lang/StringBuilder
       7: dup
       8: invokespecial #85                 // Method java/lang/StringBuilder."<init>":()V
      11: astore_3
      12: aload_3
      13: aload_1
      14: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: pop
      18: aload_3
      19: ldc           #91                 // String .json
      21: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: new           #93                 // class java/io/File
      28: dup
      29: aload_2
      30: aload_3
      31: invokevirtual #96                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      34: invokespecial #99                 // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
      37: astore_1
      38: aload_1
      39: invokevirtual #147                // Method java/io/File.delete:()Z
      42: ifne          78
      45: new           #84                 // class java/lang/StringBuilder
      48: dup
      49: invokespecial #85                 // Method java/lang/StringBuilder."<init>":()V
      52: astore_2
      53: aload_2
      54: ldc           #149                // String Unable to delete file
      56: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      59: pop
      60: aload_2
      61: aload_1
      62: invokevirtual #152                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      65: pop
      66: new           #125                // class java/lang/IllegalStateException
      69: dup
      70: aload_2
      71: invokevirtual #96                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      74: invokespecial #154                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      77: athrow
      78: return

  public ryey.easer.core.a.j d(java.lang.String);
    Code:
       0: getstatic     #34                 // Field b:Ljava/io/File;
       3: astore_2
       4: new           #84                 // class java/lang/StringBuilder
       7: dup
       8: invokespecial #85                 // Method java/lang/StringBuilder."<init>":()V
      11: astore_3
      12: aload_3
      13: aload_1
      14: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      17: pop
      18: aload_3
      19: ldc           #91                 // String .json
      21: invokevirtual #89                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      24: pop
      25: aload_0
      26: new           #93                 // class java/io/File
      29: dup
      30: aload_2
      31: aload_3
      32: invokevirtual #96                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      35: invokespecial #99                 // Method java/io/File."<init>":(Ljava/io/File;Ljava/lang/String;)V
      38: invokespecial #122                // Method a:(Ljava/io/File;)Lryey/easer/core/a/j;
      41: areturn
}
