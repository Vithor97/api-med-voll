package med.voll.api.exception;

import java.util.List;

public record ResponseError(int status,
                            String tipoErro,
                            String url,
                            List<Violation> violacoes) {
}
