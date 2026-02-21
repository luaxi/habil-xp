-- adiciona colunas current_level, xp_current_level e xp_total na tabela skill
ALTER TABLE skill
  ADD COLUMN current_level INT DEFAULT 0,
  ADD COLUMN xp_current_level INT DEFAULT 0,
  ADD COLUMN xp_total INT DEFAULT 0;