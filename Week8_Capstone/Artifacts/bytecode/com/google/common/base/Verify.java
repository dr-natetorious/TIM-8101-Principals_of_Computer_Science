public final class com.google.common.base.Verify {
  public static void verify(boolean);
    Code:
       0: iload_0
       1: ifne          12
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: invokespecial #14                 // Method com/google/common/base/VerifyException."<init>":()V
      11: athrow
      12: return

  public static void verify(boolean, java.lang.String, char);
    Code:
       0: iload_0
       1: ifne          27
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_1
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      19: aastore
      20: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      23: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      26: athrow
      27: return

  public static void verify(boolean, java.lang.String, char, char);
    Code:
       0: iload_0
       1: ifne          34
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      19: aastore
      20: dup
      21: iconst_1
      22: iload_3
      23: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      26: aastore
      27: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      30: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: return

  public static void verify(boolean, java.lang.String, char, int);
    Code:
       0: iload_0
       1: ifne          34
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      19: aastore
      20: dup
      21: iconst_1
      22: iload_3
      23: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      26: aastore
      27: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      30: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: return

  public static void verify(boolean, java.lang.String, char, long);
    Code:
       0: iload_0
       1: ifne          34
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      19: aastore
      20: dup
      21: iconst_1
      22: lload_3
      23: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      26: aastore
      27: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      30: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: return

  public static void verify(boolean, java.lang.String, char, java.lang.Object);
    Code:
       0: iload_0
       1: ifne          31
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      19: aastore
      20: dup
      21: iconst_1
      22: aload_3
      23: aastore
      24: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      27: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      30: athrow
      31: return

  public static void verify(boolean, java.lang.String, int);
    Code:
       0: iload_0
       1: ifne          27
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_1
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      19: aastore
      20: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      23: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      26: athrow
      27: return

  public static void verify(boolean, java.lang.String, int, char);
    Code:
       0: iload_0
       1: ifne          34
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      19: aastore
      20: dup
      21: iconst_1
      22: iload_3
      23: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      26: aastore
      27: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      30: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: return

  public static void verify(boolean, java.lang.String, int, int);
    Code:
       0: iload_0
       1: ifne          34
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      19: aastore
      20: dup
      21: iconst_1
      22: iload_3
      23: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      26: aastore
      27: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      30: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: return

  public static void verify(boolean, java.lang.String, int, long);
    Code:
       0: iload_0
       1: ifne          34
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      19: aastore
      20: dup
      21: iconst_1
      22: lload_3
      23: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      26: aastore
      27: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      30: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      33: athrow
      34: return

  public static void verify(boolean, java.lang.String, int, java.lang.Object);
    Code:
       0: iload_0
       1: ifne          31
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: iload_2
      16: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      19: aastore
      20: dup
      21: iconst_1
      22: aload_3
      23: aastore
      24: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      27: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      30: athrow
      31: return

  public static void verify(boolean, java.lang.String, long);
    Code:
       0: iload_0
       1: ifne          27
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_1
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: lload_2
      16: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      19: aastore
      20: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      23: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      26: athrow
      27: return

  public static void verify(boolean, java.lang.String, long, char);
    Code:
       0: iload_0
       1: ifne          35
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: lload_2
      16: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      19: aastore
      20: dup
      21: iconst_1
      22: iload         4
      24: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      27: aastore
      28: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      31: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      34: athrow
      35: return

  public static void verify(boolean, java.lang.String, long, int);
    Code:
       0: iload_0
       1: ifne          35
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: lload_2
      16: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      19: aastore
      20: dup
      21: iconst_1
      22: iload         4
      24: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      27: aastore
      28: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      31: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      34: athrow
      35: return

  public static void verify(boolean, java.lang.String, long, long);
    Code:
       0: iload_0
       1: ifne          35
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: lload_2
      16: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      19: aastore
      20: dup
      21: iconst_1
      22: lload         4
      24: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      27: aastore
      28: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      31: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      34: athrow
      35: return

  public static void verify(boolean, java.lang.String, long, java.lang.Object);
    Code:
       0: iload_0
       1: ifne          32
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: lload_2
      16: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      19: aastore
      20: dup
      21: iconst_1
      22: aload         4
      24: aastore
      25: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      28: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      31: athrow
      32: return

  public static void verify(boolean, java.lang.String, java.lang.Object);
    Code:
       0: iload_0
       1: ifne          24
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_1
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_2
      16: aastore
      17: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      20: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      23: athrow
      24: return

  public static void verify(boolean, java.lang.String, java.lang.Object, char);
    Code:
       0: iload_0
       1: ifne          31
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_2
      16: aastore
      17: dup
      18: iconst_1
      19: iload_3
      20: invokestatic  #21                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      23: aastore
      24: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      27: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      30: athrow
      31: return

  public static void verify(boolean, java.lang.String, java.lang.Object, int);
    Code:
       0: iload_0
       1: ifne          31
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_2
      16: aastore
      17: dup
      18: iconst_1
      19: iload_3
      20: invokestatic  #37                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      23: aastore
      24: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      27: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      30: athrow
      31: return

  public static void verify(boolean, java.lang.String, java.lang.Object, long);
    Code:
       0: iload_0
       1: ifne          31
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_2
      16: aastore
      17: dup
      18: iconst_1
      19: lload_3
      20: invokestatic  #43                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      23: aastore
      24: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      27: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      30: athrow
      31: return

  public static void verify(boolean, java.lang.String, java.lang.Object, java.lang.Object);
    Code:
       0: iload_0
       1: ifne          28
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_2
      16: aastore
      17: dup
      18: iconst_1
      19: aload_3
      20: aastore
      21: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      24: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      27: athrow
      28: return

  public static void verify(boolean, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object);
    Code:
       0: iload_0
       1: ifne          33
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_3
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_2
      16: aastore
      17: dup
      18: iconst_1
      19: aload_3
      20: aastore
      21: dup
      22: iconst_2
      23: aload         4
      25: aastore
      26: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      29: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      32: athrow
      33: return

  public static void verify(boolean, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object);
    Code:
       0: iload_0
       1: ifne          38
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: iconst_4
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_2
      16: aastore
      17: dup
      18: iconst_1
      19: aload_3
      20: aastore
      21: dup
      22: iconst_2
      23: aload         4
      25: aastore
      26: dup
      27: iconst_3
      28: aload         5
      30: aastore
      31: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      34: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      37: athrow
      38: return

  public static void verify(boolean, java.lang.String, java.lang.Object...);
    Code:
       0: iload_0
       1: ifne          17
       4: new           #13                 // class com/google/common/base/VerifyException
       7: dup
       8: aload_1
       9: aload_2
      10: invokestatic  #27                 // Method com/google/common/base/Preconditions.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      13: invokespecial #30                 // Method com/google/common/base/VerifyException."<init>":(Ljava/lang/String;)V
      16: athrow
      17: return

  public static <T> T verifyNotNull(T);
    Code:
       0: aload_0
       1: ldc           #67                 // String expected a non-null reference
       3: iconst_0
       4: anewarray     #4                  // class java/lang/Object
       7: invokestatic  #70                 // Method verifyNotNull:(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
      10: areturn

  public static <T> T verifyNotNull(T, java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: ifnull        9
       4: iconst_1
       5: istore_3
       6: goto          11
       9: iconst_0
      10: istore_3
      11: iload_3
      12: aload_1
      13: aload_2
      14: invokestatic  #75                 // Method verify:(ZLjava/lang/String;[Ljava/lang/Object;)V
      17: aload_0
      18: areturn
}
