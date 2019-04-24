public class ryey.easer.core.a.a.a.d {
  public static <T> T a(ryey.easer.core.a.a.a.f<T>, java.io.File);
    Code:
       0: new           #12                 // class java/io/FileInputStream
       3: dup
       4: aload_1
       5: invokespecial #16                 // Method java/io/FileInputStream."<init>":(Ljava/io/File;)V
       8: astore_1
       9: aload_0
      10: aload_1
      11: invokeinterface #21,  2           // InterfaceMethod ryey/easer/core/a/a/a/f.a:(Ljava/io/InputStream;)Ljava/lang/Object;
      16: astore_0
      17: aload_1
      18: invokevirtual #25                 // Method java/io/FileInputStream.close:()V
      21: aload_0
      22: areturn
      23: astore_0
      24: aload_0
      25: invokestatic  #30                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      28: new           #32                 // class java/lang/IllegalAccessError
      31: dup
      32: invokespecial #34                 // Method java/lang/IllegalAccessError."<init>":()V
      35: athrow
      36: astore_0
      37: aload_0
      38: athrow
    Exception table:
       from    to  target type
           0    21    36   Class java/io/FileNotFoundException
           0    21    23   Class java/io/IOException

  public static <T> void a(ryey.easer.core.a.a.a.i<T>, java.io.File, T);
    Code:
       0: new           #42                 // class java/io/FileOutputStream
       3: dup
       4: aload_1
       5: invokespecial #43                 // Method java/io/FileOutputStream."<init>":(Ljava/io/File;)V
       8: astore_1
       9: aload_1
      10: aload_0
      11: aload_2
      12: invokeinterface #48,  2           // InterfaceMethod ryey/easer/core/a/a/a/i.a:(Ljava/lang/Object;)Ljava/lang/String;
      17: invokevirtual #54                 // Method java/lang/String.getBytes:()[B
      20: invokevirtual #58                 // Method java/io/FileOutputStream.write:([B)V
      23: aload_1
      24: invokevirtual #59                 // Method java/io/FileOutputStream.close:()V
      27: return
      28: astore_0
      29: aload_0
      30: ldc           #61                 // String Unable to serialize
      32: iconst_0
      33: anewarray     #4                  // class java/lang/Object
      36: invokestatic  #66                 // Method com/b/a/i.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      39: aload_0
      40: invokestatic  #30                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      43: new           #10                 // class java/io/IOException
      46: dup
      47: aload_0
      48: invokevirtual #70                 // Method ryey/easer/core/a/a/a/j.getMessage:()Ljava/lang/String;
      51: invokespecial #73                 // Method java/io/IOException."<init>":(Ljava/lang/String;)V
      54: athrow
    Exception table:
       from    to  target type
           0    27    28   Class ryey/easer/core/a/a/a/j
}
