public final class com.c.a.h {
  public static final com.c.a.h$a a;

  static {};
    Code:
       0: new           #6                  // class com/c/a/h$a
       3: dup
       4: aconst_null
       5: invokespecial #21                 // Method com/c/a/h$a."<init>":(La/b/b/a;)V
       8: putstatic     #23                 // Field a:Lcom/c/a/h$a;
      11: return

  public com.c.a.h(java.lang.String, a.b.b.a);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #32                 // Method "<init>":(Ljava/lang/String;)V
       5: return

  public final void a(java.lang.String);
    Code:
       0: aload_1
       1: ldc           #51                 // String message
       3: invokestatic  #56                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: iconst_1
       8: invokespecial #36                 // Method a:(I)Z
      11: ifeq          34
      14: aload_0
      15: getfield      #29                 // Field b:Ljava/lang/String;
      18: aload_1
      19: invokestatic  #62                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
      22: pop
      23: aload_1
      24: putstatic     #64                 // Field d:Ljava/lang/String;
      27: aload_0
      28: getfield      #29                 // Field b:Ljava/lang/String;
      31: putstatic     #66                 // Field e:Ljava/lang/String;
      34: return

  public final void a(java.lang.Object...);
    Code:
       0: aload_1
       1: ldc           #69                 // String data
       3: invokestatic  #56                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_0
       8: iconst_0
       9: aload_1
      10: aload_1
      11: arraylength
      12: invokestatic  #75                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
      15: invokespecial #77                 // Method a:(I[Ljava/lang/Object;)Ljava/lang/String;
      18: invokevirtual #79                 // Method a:(Ljava/lang/String;)V
      21: return

  public final void b(java.lang.String);
    Code:
       0: aload_1
       1: ldc           #51                 // String message
       3: invokestatic  #56                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: iconst_2
       8: invokespecial #36                 // Method a:(I)Z
      11: ifeq          34
      14: aload_0
      15: getfield      #29                 // Field b:Ljava/lang/String;
      18: aload_1
      19: invokestatic  #82                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      22: pop
      23: aload_1
      24: putstatic     #64                 // Field d:Ljava/lang/String;
      27: aload_0
      28: getfield      #29                 // Field b:Ljava/lang/String;
      31: putstatic     #66                 // Field e:Ljava/lang/String;
      34: return

  public final void b(java.lang.Object...);
    Code:
       0: aload_1
       1: ldc           #69                 // String data
       3: invokestatic  #56                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_0
       8: iconst_1
       9: aload_1
      10: aload_1
      11: arraylength
      12: invokestatic  #75                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
      15: invokespecial #77                 // Method a:(I[Ljava/lang/Object;)Ljava/lang/String;
      18: invokevirtual #79                 // Method a:(Ljava/lang/String;)V
      21: return

  public final void c(java.lang.Object...);
    Code:
       0: aload_1
       1: ldc           #69                 // String data
       3: invokestatic  #56                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_0
       8: iconst_2
       9: aload_1
      10: aload_1
      11: arraylength
      12: invokestatic  #75                 // Method java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
      15: invokespecial #77                 // Method a:(I[Ljava/lang/Object;)Ljava/lang/String;
      18: invokevirtual #84                 // Method b:(Ljava/lang/String;)V
      21: return
}
