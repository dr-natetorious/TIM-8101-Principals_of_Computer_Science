public final class com.b.a.i {
  static {};
    Code:
       0: new           #10                 // class com/b/a/j
       3: dup
       4: invokespecial #13                 // Method com/b/a/j."<init>":()V
       7: putstatic     #15                 // Field a:Lcom/b/a/l;
      10: return

  public static void a(int, java.lang.String, java.lang.String, java.lang.Throwable);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: iload_0
       4: aload_1
       5: aload_2
       6: aload_3
       7: invokeinterface #22,  5           // InterfaceMethod com/b/a/l.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      12: return

  public static void a(com.b.a.f);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: invokeinterface #25,  2           // InterfaceMethod com/b/a/l.a:(Lcom/b/a/f;)V
       9: return

  public static void a(java.lang.Object);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: invokeinterface #28,  2           // InterfaceMethod com/b/a/l.a:(Ljava/lang/Object;)V
       9: return

  public static void a(java.lang.String, java.lang.Object...);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: aload_1
       5: invokeinterface #31,  3           // InterfaceMethod com/b/a/l.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      10: return

  public static void a(java.lang.Throwable, java.lang.String, java.lang.Object...);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: aload_1
       5: aload_2
       6: invokeinterface #34,  4           // InterfaceMethod com/b/a/l.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      11: return

  public static void b(java.lang.String, java.lang.Object...);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aconst_null
       4: aload_0
       5: aload_1
       6: invokeinterface #34,  4           // InterfaceMethod com/b/a/l.a:(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
      11: return

  public static void c(java.lang.String, java.lang.Object...);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: aload_1
       5: invokeinterface #38,  3           // InterfaceMethod com/b/a/l.c:(Ljava/lang/String;[Ljava/lang/Object;)V
      10: return

  public static void d(java.lang.String, java.lang.Object...);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: aload_1
       5: invokeinterface #41,  3           // InterfaceMethod com/b/a/l.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      10: return

  public static void e(java.lang.String, java.lang.Object...);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: aload_1
       5: invokeinterface #44,  3           // InterfaceMethod com/b/a/l.b:(Ljava/lang/String;[Ljava/lang/Object;)V
      10: return

  public static void f(java.lang.String, java.lang.Object...);
    Code:
       0: getstatic     #15                 // Field a:Lcom/b/a/l;
       3: aload_0
       4: aload_1
       5: invokeinterface #47,  3           // InterfaceMethod com/b/a/l.e:(Ljava/lang/String;[Ljava/lang/Object;)V
      10: return
}
