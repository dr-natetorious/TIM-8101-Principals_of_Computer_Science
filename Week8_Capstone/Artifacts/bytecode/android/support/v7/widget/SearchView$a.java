class android.support.v7.widget.SearchView$a {
  android.support.v7.widget.SearchView$a();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: ldc           #18                 // class android/widget/AutoCompleteTextView
       7: ldc           #20                 // String doBeforeTextChanged
       9: iconst_0
      10: anewarray     #22                 // class java/lang/Class
      13: invokevirtual #26                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      16: putfield      #28                 // Field a:Ljava/lang/reflect/Method;
      19: aload_0
      20: getfield      #28                 // Field a:Ljava/lang/reflect/Method;
      23: iconst_1
      24: invokevirtual #34                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      27: aload_0
      28: ldc           #18                 // class android/widget/AutoCompleteTextView
      30: ldc           #36                 // String doAfterTextChanged
      32: iconst_0
      33: anewarray     #22                 // class java/lang/Class
      36: invokevirtual #26                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      39: putfield      #38                 // Field b:Ljava/lang/reflect/Method;
      42: aload_0
      43: getfield      #38                 // Field b:Ljava/lang/reflect/Method;
      46: iconst_1
      47: invokevirtual #34                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      50: aload_0
      51: ldc           #18                 // class android/widget/AutoCompleteTextView
      53: ldc           #40                 // String ensureImeVisible
      55: iconst_1
      56: anewarray     #22                 // class java/lang/Class
      59: dup
      60: iconst_0
      61: getstatic     #46                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
      64: aastore
      65: invokevirtual #49                 // Method java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      68: putfield      #51                 // Field c:Ljava/lang/reflect/Method;
      71: aload_0
      72: getfield      #51                 // Field c:Ljava/lang/reflect/Method;
      75: iconst_1
      76: invokevirtual #34                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      79: return
      80: astore_1
      81: goto          27
      84: astore_1
      85: goto          50
      88: astore_1
      89: return
    Exception table:
       from    to  target type
           4    27    80   Class java/lang/NoSuchMethodException
          27    50    84   Class java/lang/NoSuchMethodException
          50    79    88   Class java/lang/NoSuchMethodException

  void a(android.widget.AutoCompleteTextView);
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Ljava/lang/reflect/Method;
       4: ifnull        20
       7: aload_0
       8: getfield      #28                 // Field a:Ljava/lang/reflect/Method;
      11: aload_1
      12: iconst_0
      13: anewarray     #4                  // class java/lang/Object
      16: invokevirtual #59                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      19: pop
      20: return
      21: astore_1
      22: return
    Exception table:
       from    to  target type
           7    20    21   Class java/lang/Exception

  void a(android.widget.AutoCompleteTextView, boolean);
    Code:
       0: aload_0
       1: getfield      #51                 // Field c:Ljava/lang/reflect/Method;
       4: ifnull        27
       7: aload_0
       8: getfield      #51                 // Field c:Ljava/lang/reflect/Method;
      11: aload_1
      12: iconst_1
      13: anewarray     #4                  // class java/lang/Object
      16: dup
      17: iconst_0
      18: iload_2
      19: invokestatic  #64                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      22: aastore
      23: invokevirtual #59                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      26: pop
      27: return
      28: astore_1
      29: return
    Exception table:
       from    to  target type
           7    27    28   Class java/lang/Exception

  void b(android.widget.AutoCompleteTextView);
    Code:
       0: aload_0
       1: getfield      #38                 // Field b:Ljava/lang/reflect/Method;
       4: ifnull        20
       7: aload_0
       8: getfield      #38                 // Field b:Ljava/lang/reflect/Method;
      11: aload_1
      12: iconst_0
      13: anewarray     #4                  // class java/lang/Object
      16: invokevirtual #59                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      19: pop
      20: return
      21: astore_1
      22: return
    Exception table:
       from    to  target type
           7    20    21   Class java/lang/Exception
}
