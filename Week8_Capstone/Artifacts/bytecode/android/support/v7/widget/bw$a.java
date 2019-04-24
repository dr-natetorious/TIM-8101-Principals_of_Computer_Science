class android.support.v7.widget.bw$a {
  static android.support.v4.g.k$a<android.support.v7.widget.bw$a> d;

  int a;

  android.support.v7.widget.RecyclerView$f$c b;

  android.support.v7.widget.RecyclerView$f$c c;

  static {};
    Code:
       0: new           #18                 // class android/support/v4/g/k$b
       3: dup
       4: bipush        20
       6: invokespecial #22                 // Method android/support/v4/g/k$b."<init>":(I)V
       9: putstatic     #24                 // Field d:Landroid/support/v4/g/k$a;
      12: return

  static android.support.v7.widget.bw$a a();
    Code:
       0: getstatic     #24                 // Field d:Landroid/support/v4/g/k$a;
       3: invokeinterface #33,  1           // InterfaceMethod android/support/v4/g/k$a.a:()Ljava/lang/Object;
       8: checkcast     #2                  // class android/support/v7/widget/bw$a
      11: astore_1
      12: aload_1
      13: astore_0
      14: aload_1
      15: ifnonnull     26
      18: new           #2                  // class android/support/v7/widget/bw$a
      21: dup
      22: invokespecial #34                 // Method "<init>":()V
      25: astore_0
      26: aload_0
      27: areturn

  static void a(android.support.v7.widget.bw$a);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #37                 // Field a:I
       5: aload_0
       6: aconst_null
       7: putfield      #39                 // Field b:Landroid/support/v7/widget/RecyclerView$f$c;
      10: aload_0
      11: aconst_null
      12: putfield      #41                 // Field c:Landroid/support/v7/widget/RecyclerView$f$c;
      15: getstatic     #24                 // Field d:Landroid/support/v4/g/k$a;
      18: aload_0
      19: invokeinterface #44,  2           // InterfaceMethod android/support/v4/g/k$a.a:(Ljava/lang/Object;)Z
      24: pop
      25: return

  static void b();
    Code:
       0: getstatic     #24                 // Field d:Landroid/support/v4/g/k$a;
       3: invokeinterface #33,  1           // InterfaceMethod android/support/v4/g/k$a.a:()Ljava/lang/Object;
       8: ifnull        14
      11: goto          0
      14: return
}
