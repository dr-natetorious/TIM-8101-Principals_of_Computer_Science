public final class ryey.easer.b.a extends java.lang.Enum<ryey.easer.b.a> {
  public static final ryey.easer.b.a a;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/b/a
       3: dup
       4: ldc           #13                 // String JSON
       6: iconst_0
       7: invokespecial #17                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #19                 // Field a:Lryey/easer/b/a;
      13: iconst_1
      14: anewarray     #2                  // class ryey/easer/b/a
      17: dup
      18: iconst_0
      19: getstatic     #19                 // Field a:Lryey/easer/b/a;
      22: aastore
      23: putstatic     #21                 // Field b:[Lryey/easer/b/a;
      26: return

  public static ryey.easer.b.a a(android.os.Parcel);
    Code:
       0: invokestatic  #29                 // Method values:()[Lryey/easer/b/a;
       3: aload_0
       4: invokevirtual #35                 // Method android/os/Parcel.readInt:()I
       7: aaload
       8: areturn

  public static void a(android.os.Parcel, ryey.easer.b.a);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #39                 // Method ordinal:()I
       5: invokevirtual #43                 // Method android/os/Parcel.writeInt:(I)V
       8: return

  public static ryey.easer.b.a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/b/a
       2: aload_0
       3: invokestatic  #48                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/b/a
       9: areturn

  public static ryey.easer.b.a[] values();
    Code:
       0: getstatic     #21                 // Field b:[Lryey/easer/b/a;
       3: invokevirtual #53                 // Method "[Lryey/easer/b/a;".clone:()Ljava/lang/Object;
       6: checkcast     #49                 // class "[Lryey/easer/b/a;"
       9: areturn
}
