class ryey.easer.plugins.event.d.a {
  static final java.lang.String[] a;

  long b;

  java.util.Set<java.lang.String> c;

  static {};
    Code:
       0: iconst_2
       1: anewarray     #15                 // class java/lang/String
       4: dup
       5: iconst_0
       6: ldc           #17                 // String start
       8: aastore
       9: dup
      10: iconst_1
      11: ldc           #19                 // String end
      13: aastore
      14: putstatic     #21                 // Field a:[Ljava/lang/String;
      17: return

  ryey.easer.plugins.event.d.a();
    Code:
       0: aload_0
       1: invokespecial #25                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #27                 // class android/support/v4/g/b
       8: dup
       9: getstatic     #21                 // Field a:[Ljava/lang/String;
      12: arraylength
      13: invokespecial #30                 // Method android/support/v4/g/b."<init>":(I)V
      16: putfield      #32                 // Field c:Ljava/util/Set;
      19: return
}
