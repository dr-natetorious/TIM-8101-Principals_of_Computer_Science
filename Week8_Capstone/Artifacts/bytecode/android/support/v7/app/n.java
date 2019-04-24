class android.support.v7.app.n {
  static boolean a(android.content.res.Resources);
    Code:
       0: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        24
       5: if_icmplt     13
       8: aload_0
       9: invokestatic  #24                 // Method d:(Landroid/content/res/Resources;)Z
      12: ireturn
      13: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
      16: bipush        23
      18: if_icmplt     26
      21: aload_0
      22: invokestatic  #26                 // Method c:(Landroid/content/res/Resources;)Z
      25: ireturn
      26: getstatic     #22                 // Field android/os/Build$VERSION.SDK_INT:I
      29: bipush        21
      31: if_icmplt     39
      34: aload_0
      35: invokestatic  #28                 // Method b:(Landroid/content/res/Resources;)Z
      38: ireturn
      39: iconst_0
      40: ireturn
}
