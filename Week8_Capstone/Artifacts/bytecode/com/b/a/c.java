public class com.b.a.c implements com.b.a.f {
  public com.b.a.c();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: invokestatic  #17                 // Method com/b/a/b.a:()Lcom/b/a/b$a;
       8: invokevirtual #22                 // Method com/b/a/b$a.a:()Lcom/b/a/b;
      11: putfield      #24                 // Field a:Lcom/b/a/e;
      14: return

  public void a(int, java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: getfield      #24                 // Field a:Lcom/b/a/e;
       4: iload_1
       5: aload_2
       6: aload_3
       7: invokeinterface #30,  4           // InterfaceMethod com/b/a/e.a:(ILjava/lang/String;Ljava/lang/String;)V
      12: return

  public boolean a(int, java.lang.String);
    Code:
       0: iconst_1
       1: ireturn
}
