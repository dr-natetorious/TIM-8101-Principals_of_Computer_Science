public final class com.google.common.base.Throwables {
  static final java.lang.String SHARED_SECRETS_CLASSNAME;

  static {};
    Code:
       0: invokestatic  #24                 // Method getJLA:()Ljava/lang/Object;
       3: putstatic     #26                 // Field jla:Ljava/lang/Object;
       6: getstatic     #26                 // Field jla:Ljava/lang/Object;
       9: astore_0
      10: aconst_null
      11: astore_1
      12: aload_0
      13: ifnonnull     21
      16: aconst_null
      17: astore_0
      18: goto          25
      21: invokestatic  #30                 // Method getGetMethod:()Ljava/lang/reflect/Method;
      24: astore_0
      25: aload_0
      26: putstatic     #32                 // Field getStackTraceElementMethod:Ljava/lang/reflect/Method;
      29: getstatic     #26                 // Field jla:Ljava/lang/Object;
      32: ifnonnull     40
      35: aload_1
      36: astore_0
      37: goto          44
      40: invokestatic  #35                 // Method getSizeMethod:()Ljava/lang/reflect/Method;
      43: astore_0
      44: aload_0
      45: putstatic     #37                 // Field getStackTraceDepthMethod:Ljava/lang/reflect/Method;
      48: return

  static java.lang.reflect.Method access$000();
    Code:
       0: getstatic     #32                 // Field getStackTraceElementMethod:Ljava/lang/reflect/Method;
       3: areturn

  static java.lang.Object access$100();
    Code:
       0: getstatic     #26                 // Field jla:Ljava/lang/Object;
       3: areturn

  static java.lang.Object access$200(java.lang.reflect.Method, java.lang.Object, java.lang.Object[]);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokestatic  #48                 // Method invokeAccessibleNonThrowingMethod:(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
       6: areturn

  static java.lang.reflect.Method access$300();
    Code:
       0: getstatic     #37                 // Field getStackTraceDepthMethod:Ljava/lang/reflect/Method;
       3: areturn

  public static java.util.List<java.lang.Throwable> getCausalChain(java.lang.Throwable);
    Code:
       0: aload_0
       1: invokestatic  #57                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: new           #59                 // class java/util/ArrayList
       8: dup
       9: iconst_4
      10: invokespecial #62                 // Method java/util/ArrayList."<init>":(I)V
      13: astore        4
      15: aload         4
      17: aload_0
      18: invokeinterface #68,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      23: pop
      24: aload_0
      25: astore_2
      26: iconst_0
      27: istore_1
      28: aload_0
      29: astore_3
      30: aload_2
      31: astore_0
      32: aload_3
      33: invokevirtual #74                 // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
      36: astore_3
      37: aload_3
      38: ifnull        86
      41: aload         4
      43: aload_3
      44: invokeinterface #68,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      49: pop
      50: aload_3
      51: aload_0
      52: if_acmpne     66
      55: new           #76                 // class java/lang/IllegalArgumentException
      58: dup
      59: ldc           #78                 // String Loop in causal chain detected.
      61: aload_3
      62: invokespecial #81                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
      65: athrow
      66: aload_0
      67: astore_2
      68: iload_1
      69: ifeq          77
      72: aload_0
      73: invokevirtual #74                 // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
      76: astore_2
      77: iload_1
      78: iconst_1
      79: ixor
      80: istore_1
      81: aload_2
      82: astore_0
      83: goto          32
      86: aload         4
      88: invokestatic  #87                 // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
      91: areturn

  public static <X extends java.lang.Throwable> X getCauseAs(java.lang.Throwable, java.lang.Class<X>);
    Code:
       0: aload_1
       1: aload_0
       2: invokevirtual #74                 // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
       5: invokevirtual #98                 // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #70                 // class java/lang/Throwable
      11: astore_1
      12: aload_1
      13: areturn
      14: astore_1
      15: aload_1
      16: aload_0
      17: invokevirtual #102                // Method java/lang/ClassCastException.initCause:(Ljava/lang/Throwable;)Ljava/lang/Throwable;
      20: pop
      21: aload_1
      22: athrow
    Exception table:
       from    to  target type
           0    12    14   Class java/lang/ClassCastException

  public static java.lang.Throwable getRootCause(java.lang.Throwable);
    Code:
       0: aload_0
       1: astore_3
       2: iconst_0
       3: istore_1
       4: aload_0
       5: astore_2
       6: aload_3
       7: astore_0
       8: aload_2
       9: invokevirtual #74                 // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
      12: astore_3
      13: aload_3
      14: ifnull        55
      17: aload_3
      18: aload_0
      19: if_acmpne     33
      22: new           #76                 // class java/lang/IllegalArgumentException
      25: dup
      26: ldc           #78                 // String Loop in causal chain detected.
      28: aload_3
      29: invokespecial #81                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;Ljava/lang/Throwable;)V
      32: athrow
      33: aload_0
      34: astore_2
      35: iload_1
      36: ifeq          44
      39: aload_0
      40: invokevirtual #74                 // Method java/lang/Throwable.getCause:()Ljava/lang/Throwable;
      43: astore_2
      44: iload_1
      45: iconst_1
      46: ixor
      47: istore_1
      48: aload_2
      49: astore_0
      50: aload_3
      51: astore_2
      52: goto          8
      55: aload_2
      56: areturn

  public static java.lang.String getStackTraceAsString(java.lang.Throwable);
    Code:
       0: new           #147                // class java/io/StringWriter
       3: dup
       4: invokespecial #148                // Method java/io/StringWriter."<init>":()V
       7: astore_1
       8: aload_0
       9: new           #150                // class java/io/PrintWriter
      12: dup
      13: aload_1
      14: invokespecial #153                // Method java/io/PrintWriter."<init>":(Ljava/io/Writer;)V
      17: invokestatic  #159                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;Ljava/io/PrintWriter;)V
      20: aload_1
      21: invokevirtual #163                // Method java/io/StringWriter.toString:()Ljava/lang/String;
      24: areturn

  public static java.util.List<java.lang.StackTraceElement> lazyStackTrace(java.lang.Throwable);
    Code:
       0: invokestatic  #181                // Method lazyStackTraceIsLazy:()Z
       3: ifeq          11
       6: aload_0
       7: invokestatic  #183                // Method jlaStackTrace:(Ljava/lang/Throwable;)Ljava/util/List;
      10: areturn
      11: aload_0
      12: invokevirtual #187                // Method java/lang/Throwable.getStackTrace:()[Ljava/lang/StackTraceElement;
      15: invokestatic  #193                // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
      18: invokestatic  #87                 // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
      21: areturn

  public static boolean lazyStackTraceIsLazy();
    Code:
       0: getstatic     #32                 // Field getStackTraceElementMethod:Ljava/lang/reflect/Method;
       3: ifnull        14
       6: getstatic     #37                 // Field getStackTraceDepthMethod:Ljava/lang/reflect/Method;
       9: ifnull        14
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn

  public static java.lang.RuntimeException propagate(java.lang.Throwable);
    Code:
       0: aload_0
       1: invokestatic  #198                // Method throwIfUnchecked:(Ljava/lang/Throwable;)V
       4: new           #170                // class java/lang/RuntimeException
       7: dup
       8: aload_0
       9: invokespecial #173                // Method java/lang/RuntimeException."<init>":(Ljava/lang/Throwable;)V
      12: athrow

  public static <X extends java.lang.Throwable> void propagateIfInstanceOf(java.lang.Throwable, java.lang.Class<X>);
    Code:
       0: aload_0
       1: ifnull        9
       4: aload_0
       5: aload_1
       6: invokestatic  #205                // Method throwIfInstanceOf:(Ljava/lang/Throwable;Ljava/lang/Class;)V
       9: return

  public static void propagateIfPossible(java.lang.Throwable);
    Code:
       0: aload_0
       1: ifnull        8
       4: aload_0
       5: invokestatic  #198                // Method throwIfUnchecked:(Ljava/lang/Throwable;)V
       8: return

  public static <X extends java.lang.Throwable> void propagateIfPossible(java.lang.Throwable, java.lang.Class<X>);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #209                // Method propagateIfInstanceOf:(Ljava/lang/Throwable;Ljava/lang/Class;)V
       5: aload_0
       6: invokestatic  #211                // Method propagateIfPossible:(Ljava/lang/Throwable;)V
       9: return

  public static <X1 extends java.lang.Throwable, X2 extends java.lang.Throwable> void propagateIfPossible(java.lang.Throwable, java.lang.Class<X1>, java.lang.Class<X2>);
    Code:
       0: aload_2
       1: invokestatic  #57                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: aload_1
       7: invokestatic  #209                // Method propagateIfInstanceOf:(Ljava/lang/Throwable;Ljava/lang/Class;)V
      10: aload_0
      11: aload_2
      12: invokestatic  #214                // Method propagateIfPossible:(Ljava/lang/Throwable;Ljava/lang/Class;)V
      15: return

  public static <X extends java.lang.Throwable> void throwIfInstanceOf(java.lang.Throwable, java.lang.Class<X>);
    Code:
       0: aload_0
       1: invokestatic  #57                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_1
       6: aload_0
       7: invokevirtual #218                // Method java/lang/Class.isInstance:(Ljava/lang/Object;)Z
      10: ifeq          22
      13: aload_1
      14: aload_0
      15: invokevirtual #98                 // Method java/lang/Class.cast:(Ljava/lang/Object;)Ljava/lang/Object;
      18: checkcast     #70                 // class java/lang/Throwable
      21: athrow
      22: return

  public static void throwIfUnchecked(java.lang.Throwable);
    Code:
       0: aload_0
       1: invokestatic  #57                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: instanceof    #170                // class java/lang/RuntimeException
       9: ifeq          17
      12: aload_0
      13: checkcast     #170                // class java/lang/RuntimeException
      16: athrow
      17: aload_0
      18: instanceof    #220                // class java/lang/Error
      21: ifeq          29
      24: aload_0
      25: checkcast     #220                // class java/lang/Error
      28: athrow
      29: return
}
