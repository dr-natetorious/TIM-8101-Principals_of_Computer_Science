public final class android.support.v4.view.g {
  public static int a(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        17
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #18                 // Method android/view/ViewGroup$MarginLayoutParams.getMarginStart:()I
      12: ireturn
      13: aload_0
      14: getfield      #21                 // Field android/view/ViewGroup$MarginLayoutParams.leftMargin:I
      17: ireturn

  public static int b(android.view.ViewGroup$MarginLayoutParams);
    Code:
       0: getstatic     #12                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        17
       5: if_icmplt     13
       8: aload_0
       9: invokevirtual #26                 // Method android/view/ViewGroup$MarginLayoutParams.getMarginEnd:()I
      12: ireturn
      13: aload_0
      14: getfield      #29                 // Field android/view/ViewGroup$MarginLayoutParams.rightMargin:I
      17: ireturn
}
