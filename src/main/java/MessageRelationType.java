/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum MessageRelationType implements org.apache.thrift.TEnum {
  FORWARD(0),
  AUTO_REPLY(1),
  SUBORDINATE(2);

  private final int value;

  private MessageRelationType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static MessageRelationType findByValue(int value) { 
    switch (value) {
      case 0:
        return FORWARD;
      case 1:
        return AUTO_REPLY;
      case 2:
        return SUBORDINATE;
      default:
        return null;
    }
  }
}
