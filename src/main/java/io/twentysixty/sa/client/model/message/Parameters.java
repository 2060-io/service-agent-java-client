package io.twentysixty.sa.client.model.message;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Parameters implements Serializable {

  private static final long serialVersionUID = -3591319454008944749L;
  private String key;
  private String iv;
}
