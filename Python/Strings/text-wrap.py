def wrap(string, max_width):
    l = " ".join(textwrap.wrap(string, max_width))
    return textwrap.fill(l, max_width)
